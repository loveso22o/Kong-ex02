/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Seoyoung Kong
 */

package exercise02;

import java.util.Scanner;

public class Solution02 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("What is the input string? ");
        String name = in.nextLine();

        int length = name.length();

        System.out.println(name + " has " + length + " characters.");
    }
}
