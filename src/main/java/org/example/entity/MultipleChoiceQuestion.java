package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion {
    private String question;
    private List<String> choices;

    public MultipleChoiceQuestion(String question, List<String> choices){
        this.question = question;
        this.choices = choices;
    }

    public String getQuestion(){
        return question;
    }

    public List<String> getChoices(){
        return choices;
    }

}
