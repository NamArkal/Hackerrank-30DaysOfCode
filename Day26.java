import java.io.*;
import java.util.*;

public class Solution {
    
    public int day;
    public int month;
    public int year;

    public Solution(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public static int calculateFine(Solution dc1, Solution dc2){
        int fine = 0;
        if(dc1.year > dc2.year)
            fine = 10000;
        else if(dc1.month > dc2.month && dc1.year == dc2.year)
            fine = 500 * Math.abs(dc1.month-dc2.month);
        else if(dc1.day > dc2.day && dc1.month == dc2.month && dc1.year == dc2.year)
            fine = 15 * Math.abs(dc1.day-dc2.day);
        
        return fine;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Solution returnedDate = new Solution(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Solution dueDate = new Solution(sc.nextInt(), sc.nextInt(), sc.nextInt());

        int fine = calculateFine(returnedDate, dueDate);
        System.out.println(fine);
    }
}