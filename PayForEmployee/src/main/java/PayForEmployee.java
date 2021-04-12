
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PayForEmployee {
    public static void main(String[] args)
    {
        double payRate, hours;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        if ((hours=in.nextDouble())*(hours-24*7)>0)
        {
            System.out.println("The number of hours worked should not exceed the total number of hours in a week or lower than 0!");
            System.exit(0);
        }
        System.out.println("Enter the base payrate: ");
        if ((payRate=in.nextDouble())-5.15<0) 
        {
            System.out.println("The payrate must not be less than the minimum wage ($5.15) !");
            System.exit(0);
        }
      
        System.out.printf("The total pay due is %.2f", payRate*hours);
      
    }
    
}
