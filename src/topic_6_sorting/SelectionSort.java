/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_6_sorting;

import java.util.Scanner;


public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
            
             int[] arr = null;
             long timeTaken = 0;
             
               while(true) {
                
                 System.out.println("Kindly choose a number: "
                        + " 1. Add array Elements"
                        + " 2. View sorted array and time taken."
                        + " 3. Exit");
                int choice = sc.nextInt();
                
                 switch(choice) {
                    case 1:
                            System.out.println();
                            System.out.println("Enter the number of elements you want to store in the array:");
                            int num = sc.nextInt();
                            arr = new int[num];
                        
                            System.out.println("Enter " + num + " elements.");
                            for(int i = 0; i < num; i++) {
                              arr[i] = sc.nextInt();
                            }
                            break;
                    case 2: 
                            System.out.println();
                            if (arr == null) {
                                System.out.println("Elements is not yet added. Please add elements first.");
                                break;
                            }
                            
                            System.out.println("Original array:");
                            printArray(arr);

                            long startTime = System.currentTimeMillis();
                            selectionSort(arr); 
                            
                            long endTime = System.currentTimeMillis();
                            timeTaken = startTime - endTime;
                            
                            System.out.println("Sorted array:");
                            printArray(arr);
                            System.out.println("Sorting completed in: " + timeTaken + " milliseconds");
                        
                            break;   
                        
                    case 3:
                            System.out.println();
                            System.out.println("Thank you! Comeback and run it again.");
                            System.exit(0);
                            break;    
                      default:
                            System.out.println("Invalid choice. Please select a valid option.");       
                 }
              }
              
     }
}
