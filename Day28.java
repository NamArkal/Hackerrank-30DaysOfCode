import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Map<String, String> db = new LinkedHashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        sc.nextLine();

        for(int i=0; i<n; i++){
            String[] pairs = sc.nextLine().split(" ");
            db.put(pairs[1], pairs[0]);
        }

        for(String key : db.keySet()){
            if(key.endsWith("@gmail.com"))
                System.out.println(db.get(key));
        }
    }
}