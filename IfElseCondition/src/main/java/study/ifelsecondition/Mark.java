/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.ifelsecondition;
import java.util.*;
/**
 *
 * @author Administrator
 */
public class Mark {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a score (0<=score<=100): ");
        int score=in.nextInt();
        char grade;
        if (score>=90)
             grade='A'; 
        else if (score>=80)
             grade='B'; 
        else if (score>=70)
             grade='C'; 
        else if (score>=60)
             grade='D'; 
        else grade='F';
        System.out.println("Grade = "+grade);   
    }
}
