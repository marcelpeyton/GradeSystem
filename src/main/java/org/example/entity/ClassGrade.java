package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassGrade {
    private final List<Integer> scores = new ArrayList<>();

    public void addGrade(int grade){
        scores.add(grade);
    }

    public double getAverage(){
        return scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
