/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Brendyn Burns (0800633)
 */
public class PaintJobEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rooms: ");
        int walls = scanner.nextInt() * 4;
        System.out.println("Please enter the square footage of each wall: ");
        int squareFeet = scanner.nextInt();
        System.out.println("Please enter the price per gallon of paint: ");
        double pricePerGallon = scanner.nextDouble();
        
        int totalSquareFeet = squareFeet * walls;
        int gallonsOfPaint = totalSquareFeet / 115;
        double totalCostOfPaint = pricePerGallon * gallonsOfPaint;
        int totalAmountOfLabor = gallonsOfPaint * 8;
        double totalCostOfLabor = totalAmountOfLabor * 18.00;
        double totalCostOfJob = totalCostOfLabor + totalCostOfPaint;
        
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        
        System.out.println("Number of gallons of paint required: " + gallonsOfPaint);
        System.out.println("Hours of labor required: " + totalAmountOfLabor);
        System.out.println("Cost of paint: " + currencyInstance.format(totalCostOfPaint));
        System.out.println("Cost of labor: " + currencyInstance.format(totalCostOfLabor));
        System.out.println("Total cost of paint job: " + currencyInstance.format(totalCostOfJob));
        
    }
}
