package org.example.entity;

import org.example.interfaces.Tests;

import java.util.Scanner;

public class ManualTest extends Tests {
    private final String question;
    private String testResults;
    public ManualTest(StudentClass sClass, Scanner scanner, String question) {
        super(sClass,scanner);
        this.question = question;
    }

    @Override
    public void takeTest() {
        System.out.println(question);
        System.out.println("Enter your answer: ");
        testResults = scanner.nextLine();
    }

    public String getTestResults(){
        return testResults;
    }
}
