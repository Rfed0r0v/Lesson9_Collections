package Lesson9_Collections;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void lesson1() throws IOException {
        System.out.println("Task 1");

        File f1 = new File("c:\\Users\\Roman\\IdeaProjects\\Lesson9_Collections\\src\\Lesson9_Collections\\voyna.txt"); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        String input = "страдан";   // Input word to be searched
        int count = 0;   //Intialize the word to zero
        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" ");  //Split the word using space

            for (String word : words) {
                if (word.toLowerCase().startsWith(input))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
            }
        }
        if (count != 0)  //Check for count not equal to zero
        {
            System.out.println("The word " + input + " is present for " + count + " Times in the file");
        } else {
            System.out.println("The word " + input + " is not present in the file");
        }

        fr.close();
    }

    public static void lesson2() throws IOException{
        System.out.println("Task 2");

        File f1 = new File("c:\\Users\\Roman\\IdeaProjects\\Lesson9_Collections\\src\\Lesson9_Collections\\voyna.txt"); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        System.out.println("Введите слово для поиска: ");
        String input = new Scanner(System.in).nextLine();
        int count = 0;   //Intialize the word to zero
        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" ");  //Split the word using space

            for (String word : words) {
                if (word.toLowerCase().startsWith(input))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
            }
        }
        if (count != 0)  //Check for count not equal to zero
        {
            System.out.println("The word " + input + " is present for " + count + " Times in the file");
        } else {
            System.out.println("The word " + input + " is not present in the file");
        }

        fr.close();
    }

    public static void lesson3() {
        System.out.println("Task 3");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
       lesson1();
       lesson2();
       lesson3();
    }
}