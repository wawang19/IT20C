package LO1;
/**
 *

 */
public class LO1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Array 
        int[] num = {1, 2, 3};
        
        // Output to print the values of the Array individually
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        
        System.out.println("~~~~~~~");
        
        // Process to print all the values in the array in a single line
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}