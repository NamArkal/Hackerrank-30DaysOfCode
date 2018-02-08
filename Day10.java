import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder res = new StringBuilder();
        int i=0;
        while(n>0){
            res.append(n%2);
            i++;
            n = n/2;
        }
        i=0;
        res = res.reverse();
        char r = res.charAt(0);
        for(int j=0;j<res.length();j++){
            int count = 1;
            for(int k=j+1; k<res.length();k++){
                if(res.charAt(j) != res.charAt(k))
                    break;
                count++;
            }
            if(count>i){
                i = count;
            }
        }

        System.out.println(i);
    }
}