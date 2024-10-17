/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

/**
 *
 * @author ITLAB2-PC14-pagongpong
 */
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
     	
		
		 Queue customerQueue = new Queue();
                 
		 Scanner scan = new Scanner(System.in);
                 
                 
                 
                 System.out.println("Welcome to my queue system with scanner UI");
                 
                 while(true){
                 System.out.println("");
                 System.out.println("What do you want to do in the queue?");
                 System.out.println("1. Enqueue");
                 System.out.println("2. Dequeue");
                 System.out.println("3. Display");
                 System.out.println("4. Leave");
                 
                 }
    }
}