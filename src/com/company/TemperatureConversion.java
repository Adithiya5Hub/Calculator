package com.company;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temperature in C = ");

        float tempC = in.nextFloat();

        float tempF = (tempC*9/5) + 32;

        System.out.println(tempF);
    }
}
