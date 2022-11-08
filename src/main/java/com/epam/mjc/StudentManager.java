package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws IllegalArgumentException {
        Student student = Student.getValueOf(studentID);
        if (student != null) {
            return student;
        } else {
            throw new CustomException("Could not find student with ID " + studentID);
        }
    }

    public static void main(String[] args) throws NullPointerException {
        StudentManager manager = new StudentManager();
        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            if (student != null) {
                System.out.println("Student name " + student.getName());
            } else {
                throw new CustomException("Could not find a student with ID " + IDs[i]);
            }
        }
    }
}

