package com.tripadvisor.qa.testcases;

import java.util.Scanner;

public class MesurementConversion {
	public static void main(String[] args) {

        /*
         * Constants for inch, meter and kilometer in 1 centimeter.
         */
        final double INCH       = 0.394;
        final double METER      = 0.01;
        final double KILOMETER  = 0.00001;
 
        Scanner in = new Scanner(System.in);
        
        /* Read centimeter input from user */
        System.out.print("Enter length in centimeters : ");
        double cm = in.nextDouble();
        

        /* Convert cm into inch, m and km */
        double inch = cm * INCH;
        double m    = cm * METER;
        double km   = cm * KILOMETER;
        
        
        /* Print result on console */
        System.out.println(cm + " cm is equal to " + inch + " inches.");
        System.out.println(cm + " cm is equal to " + m    + " meters.");
        System.out.println(cm + " cm is equal to " + inch + " kilometers.");
    }
}

