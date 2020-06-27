package com.company.MVCPattern;

import com.company.MVCPattern.controller.StudentController;
import com.company.MVCPattern.model.Student;
import com.company.MVCPattern.view.StudentView;

public class MVCExecutor {

    public void execute(){
        Student model = new Student();
        model.setRollNumber(1);
        model.setName("Milind Sahoo");

        StudentView view =  new StudentView();

        StudentController studentController = new StudentController(model,view);
        studentController.updateView();
    }
}
