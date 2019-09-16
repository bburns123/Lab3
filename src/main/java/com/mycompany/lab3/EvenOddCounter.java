/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Brendyn Burns
 */
public class EvenOddCounter {
    static boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        
        for (int counter = 1; counter <= 100; counter++) {
            int randomNumber = r.nextInt(1000);
            if (isEven(randomNumber)) {
                evenArray.add(randomNumber);
            }
            else {
                oddArray.add(randomNumber);
            }
        }
        
        System.out.println("The random even numbers are: \n" + evenArray.toString());
        System.out.println("The random odd numbers are: \n" + oddArray.toString());
        
    }
    
}
