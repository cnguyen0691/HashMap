package com.company;

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.containsKey(10);
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


        while(myMap.get(num)==null)
        {
            System.out.println("Adding Key: ");
            String so = input.nextLine();
            myMap.put(num, so);
        }
        if (myMap.get(num)!=null){
            System.out.println(myMap.get(num));
        }

        /*System.out.println("writing keys and values to a file");
        String filename = (System.getProperty("user.dir") + File.separatorChar +"animalNoises.txt");
        System.out.println(filename);

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
        File file = new File(filename);
        scannerInput = new Scanner(file);//note that Scanner can read from a file!
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            System.out.println(line);
        }*/
    }
}

