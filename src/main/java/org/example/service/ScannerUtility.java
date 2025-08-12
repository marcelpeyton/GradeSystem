package org.example.service;

import java.util.Scanner;

public class ScannerUtility {

    public static int getNumberWithLimit(Scanner input, String inputChoice, int limit){
        while(true){
            try{
                int num = Integer.parseInt(inputChoice);
                if(num > -1 && num <= limit){
                    return num;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Input must be an Integer from 0 to " + limit);
                inputChoice = input.nextLine();
            }
        }
    }
}
