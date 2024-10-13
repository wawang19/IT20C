/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_2_linkedlist_int;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        //Creating an object to access the LinkedList Class
        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi!Welcome to the Linked List hehe");
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
                        System.out.println("What elements would you like to add? ");
                        int item1 = sc.nextInt();
                        int item2 = sc.nextInt();
                        int item3 = sc.nextInt();
                        int item4 = sc.nextInt();
                        int item5 = sc.nextInt();

                        list.add(item1);
                        list.add(item2);
                        list.add(item3);
                        list.add(item4);
                        list.add(item5);

                        System.out.println("Current Linked List:");
                        list.printList();
                        break;
            }
        }
    }
}