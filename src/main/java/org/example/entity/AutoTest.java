package org.example.entity;

import org.example.interfaces.Tests;
import org.example.service.ScannerUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoTest extends Tests {
    private final List<MultipleChoiceQuestion> questions;
    private final List<Integer> testResults = new ArrayList<>();


    public AutoTest(StudentClass sClass, List<MultipleChoiceQuestion> questions, Scanner scanner) {
        super(sClass,scanner);
        this.questions = questions;

    }

    @Override
    public void takeTest(){
        if(isCompleted){
            return;
        }

        int count = 0;

        for (MultipleChoiceQuestion multChoice : questions) {
            System.out.println(multChoice.getQuestion());
            count = 0;
            for (String choice : multChoice.getChoices()) {
                int limit = multChoice.getChoices().size() - 1;
                System.out.println(count + ". " + choice);
                String input = scanner.nextLine();
                testResults.add(ScannerUtility.getNumberWithLimit(scanner, input, limit));
                count++;
            }
        }
        isCompleted = true;
    }

    public List<Integer> getTestResults(){
        return testResults;
    }
}
