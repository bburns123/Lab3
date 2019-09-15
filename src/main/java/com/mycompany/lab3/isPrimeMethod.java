/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Brendyn Burns (0800633)
 */
public class isPrimeMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's prime: ");
        int input = scanner.nextInt();
        boolean output = false;
        
        
        if (input == 1) {
            output = true;
        }
        else if (input > 1) {
            for (int counter = 1; counter < 10; counter++) {
                if (input % counter == 0) {
                    output = true;
                    break;
                }
                else {
                    output = false;
                }
            }
        }
        if (output = true) {
            System.out.println(input + "is not a prime number!");
        }
        else {
            System.out.println(input + "is not a prime number!");
        }
    }
}
