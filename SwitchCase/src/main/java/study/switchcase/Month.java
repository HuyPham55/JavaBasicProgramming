/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.switchcase;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Month {
    public static void main(String[] args)
    {
        System.out.println("Enter a month: ");
        Scanner in = new Scanner(System.in);
        int month=in.nextInt();
        String monthString;
        switch (month)
        {
            case 1:  monthString = "January";       break;
            case 2:  monthString = "February";      break;
            case 3:  monthString = "March";         break;
            case 4:  monthString = "April";         break;
            case 5:  monthString = "May";           break;
            case 6:  monthString = "June";          break;
            case 7:  monthString = "July";          break;
            case 8:  monthString = "August";        break;
            case 9:  monthString = "September";     break;
            case 10: monthString = "October";       break;
            case 11: monthString = "November";      break;
            case 12: monthString = "December";      break;
            default: monthString = "Invalid month"; break;
        }
        System.out.println("Entered month in string: "+monthString);
    }
}
