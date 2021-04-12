/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.centimeter_inch_converter;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Centimeter_Inch_Converter {
    public static void main(String[] args)
    {
        final double CM_PER_INCH=2.54;
        Scanner in = new Scanner(System.in);
        int selection;
        System.out.println("1. Centimeter to inch\n2. Inch to centimeter\nEnter your selection: ");
        if (((selection=in.nextInt()-1)!=0)&&(selection!=1))
        {
            System.out.println("Invalid choice!");
            System.exit(0);
        }
        System.out.println("Enter a value: ");
        if (selection==0)
            System.out.printf("The converted value is %.2f inch(es)", in.nextDouble()/CM_PER_INCH);
        else 
            System.out.printf("The converted value is %.2f centimeter(s)", in.nextDouble()*CM_PER_INCH);
    }    
}
