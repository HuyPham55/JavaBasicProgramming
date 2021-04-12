
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
public class PalindromeString {

    public static void main(String[] args) {
        String palindrome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string: ");
        palindrome = scanner.nextLine();
        char[] temp = new char[palindrome.length()];
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            temp[palindrome.length() - i - 1] = palindrome.charAt(i);
        }
        System.out.print("The inverted string is: ");
        System.out.println(temp);
    }
}
