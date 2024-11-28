/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_6_sorting;
import java.util.Scanner;
/**
 *

 */
public class BubbleSort {
    
         public static void bubbleSort(int[] arr) {
             
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        public static void printArray(int[] arr) {
            
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Original array:");
            System.out.println("Enter numbers: ");
            int num = sc.nextInt();
            printArray(arr);
            bubbleSort(arr);
            System.out.println("  array:");
            printArray(arr);
            
        }
}