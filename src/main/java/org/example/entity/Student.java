package org.example.entity;

import org.example.interfaces.Tests;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<ClassGrade> classGrades = new ArrayList<>();
    private List<Tests> tests = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public void takeTest(Tests test){
        test.takeTest();
    }
}
