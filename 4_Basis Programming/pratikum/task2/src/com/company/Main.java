package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int o= 0, x=0;

        System.out.println("Enter username");
        String str = input.nextLine();

        str = str.toLowerCase();

        for(int i=0; i<str.length();i++){
            char c str.CharAt(i);
            if(c=='x'){
                x++
            }
            else if (c=='o'){
                o++;
            }
        }
        if (x == o) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
