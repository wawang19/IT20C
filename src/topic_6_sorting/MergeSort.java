
package topic_6_sorting;

import java.util.Scanner;

public class MergeSort {
      public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
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
                            mergeSort(arr); 
                            
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