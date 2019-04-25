package com.company;

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Map;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        input.nextLine();
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
        myMap.put(4, "four");
        myMap.put(5, "five");
        myMap.put(6, "six");
        myMap.put(7, "seven");
        myMap.put(8, "eight");
        myMap.put(9, "nine");
        myMap.put(10, "ten");

        Boolean answer = myMap.containsKey(num);
        String so ="";
        while (answer==false) {
            System.out.println("Do you want to add a value?");
            String ans = input.nextLine();

            if (ans.equalsIgnoreCase("N")) {
                break;
            }else if (ans.equalsIgnoreCase("Y")){
                System.out.println("Adding Value: ");
                 so = input.nextLine();
                myMap.put(num, so);
                break;
            }

        }



        System.out.println(num+" " + myMap.get(num));
    }
}





