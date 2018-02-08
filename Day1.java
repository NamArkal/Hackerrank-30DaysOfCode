import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int iVar = 0;
        double dVar = 0;
        String sVar = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        iVar = scan.nextInt();
        dVar = scan.nextDouble();
        sVar = scan.nextLine()+scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+iVar);
        System.out.println(d+dVar);
        System.out.println(s+sVar);

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        	
        scan.close();
    }
}