package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();

        int o = 0;
        int x = 0;

        if (x == o) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println("Username is: " + userName);
    }
}
