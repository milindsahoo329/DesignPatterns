package com.company.MVCPattern.controller;

import com.company.MVCPattern.model.Student;
import com.company.MVCPattern.view.StudentView;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNumber(int rollNumber){
        model.setRollNumber(rollNumber);
    }

    public int getStudentRollNumber(){
        return model.getRollNumber();
    }

    public void updateView(){
        view.printStudentDetails(model);
    }

}
