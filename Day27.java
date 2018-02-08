import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(5);
        System.out.println("4 3"); //yes
        System.out.println("0 -3 4 0");
        System.out.println("5 2"); //no
        System.out.println("0 1 4 2 2");
        System.out.println("3 3"); //yes
        System.out.println("0 -3 -4");
        System.out.println("7 2"); //no
        System.out.println("0 1 1 1 1 1 1");
        System.out.println("6 3"); //yes
        System.out.println("0 0 0 2 1 1");
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j < t; j++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count=0;
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                if(a[i]<=0)
                    count++;
            }
            if(count>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}