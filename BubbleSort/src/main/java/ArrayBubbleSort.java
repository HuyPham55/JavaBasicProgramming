/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ArrayBubbleSort {

    public static void main(String[] args) {
        int temp;
        int[] a = {4, 5, 3, 7, -3, 9, 7};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
