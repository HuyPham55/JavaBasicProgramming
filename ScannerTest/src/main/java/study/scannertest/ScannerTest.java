/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.scannertest;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScannerTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
	String str;
        System.out.print("Enter an integer: ");
        int num1=in.nextInt();   
        System.out.print("You just inserted "+num1);	  
    }
}
