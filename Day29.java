import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int max = 0;
            int number = sc.nextInt();
            int k = sc.nextInt();
            for(int j=1; j< number; j++){
                for(int m=j+1; m<=number; m++){
                    if((j&m) < k)
                        if((j&m)>max)
                            max = j&m;
                }
            }
            System.out.println(max);
        }
    }
}