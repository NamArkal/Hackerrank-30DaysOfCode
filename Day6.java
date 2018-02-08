import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String s = "";
        String s1 = "";
        String s2 = "";
        sc.nextLine();

        for(int i=0;i<count;i++) {
            s = sc.nextLine();
            String[] characters = s.split("");

            for (int j = 0; j < characters.length; j++) {
                if (j % 2 == 0) {
                    s1 += characters[j];
                } else {
                    s2 += characters[j];
                }
            }
            System.out.println(s1 + ' ' + s2);
            s1 = ""; s2 = "";
        }

        sc.close();
    }
}