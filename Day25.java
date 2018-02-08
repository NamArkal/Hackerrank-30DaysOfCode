import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0;

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();

            if (number >= 2 && isPrime(number))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }

        sc.close();
    }
}