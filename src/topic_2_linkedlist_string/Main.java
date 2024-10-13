/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_2_linkedlist_string;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
		
	//Creating an object to access the LinkedList Class
        Linkedlist list = new Linkedlist();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hiii!! Welcome to the LinkedList.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            
        while(true) {
            
             System.out.println("Choose a number in the menu you want to do: "
                + " 1. Add an Item"
                + " 2. Delete an Item"
                + " 3. Move/Swap an Item"
                + " 4. Exit");
        
            int choice = sc.nextInt();
            
           switch(choice) {
                case 1:
                    // Adding elements to the list
                        System.out.println("Add 5 Elements: ");
                        sc.nextLine();
                        String item1 = sc.nextLine();
                        String item2 = sc.nextLine();
                        String item3 = sc.nextLine();
                        String item4 = sc.nextLine();
                        String item5 = sc.nextLine();

                        list.add(item1);
                        list.add(item2);
                        list.add(item3);
                        list.add(item4);
                        list.add(item5);

                        System.out.println("------------------------------");
                        list.printList();
                        System.out.println("------------------------------");
                        break;
                case 2:
                        //Delete
                        sc.nextLine();
                        System.out.println("Enter an item you want to delete:");
                        String item6 = sc.nextLine();

                        list.deleteByValue(item6);
                        System.out.println();

                        System.out.println("------------------------------");        
                        System.out.println("Current Linked List:");
                        System.out.println("------------------------------");
                        list.printList();
                        break;   
                 case 3:
                        //Move/Swap Pointer
                        System.out.println("Enter an index you want to swap: ");
                        int item7 = sc.nextInt();

                        System.out.println("Enter an index that you will swap: ");
                        int item8 = sc.nextInt(); 
                        
                        System.out.println("Current Linked List:");
                        list.printList();
                        System.out.println("Moving/Swapping node from index " + item7 + " to index " + item8 );
                        list.moveNodePointer(item7, item8);
                        System.out.println("Current Linked List:");
                        list.printList();
                        System.out.println("------------------------------");
                        break;
                case 4:
                        //Exit the program
                        System.out.println("Thank you! Comeback and run it again.");
                        System.exit(0);
                        break;   
                default:
                        System.out.println("Invalid choice. Please select a valid option.");     
           }         
        }    
	}
}