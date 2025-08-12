package org.example.interfaces;

import org.example.entity.StudentClass;

import java.util.Scanner;

public abstract class Tests {
    protected StudentClass sClass;
    protected boolean isCompleted = false;
    protected final Scanner scanner;

    public Tests(StudentClass sClass, Scanner scanner){
        this.sClass = sClass;
        this.scanner = scanner;
    }

    public abstract void takeTest();
}
