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
    static boolean primeMethod (int input) {
        
        if (input <= 1) {
            return false;
        }
        else if (input > 1) {
            for (int counter = 2; counter < input; counter++) {
                if (input % counter == 0) {
                    return false;
                }
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's prime: ");
        int input = scanner.nextInt();
        
        if (primeMethod(input)) {
            System.out.println(input + " is a prime number! woah!");
            
        }
        else {
            System.out.println(input + " is not a prime number! :*(");
        }
            
    }
    
}
