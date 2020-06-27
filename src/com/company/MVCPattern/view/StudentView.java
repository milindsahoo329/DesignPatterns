package com.company.MVCPattern.view;

import com.company.MVCPattern.model.Student;

public class StudentView {

    public void printStudentDetails(Student student){
        System.out.println("Name - "+student.getName());
        System.out.print("Roll number - "+student.getRollNumber());
    }

}
