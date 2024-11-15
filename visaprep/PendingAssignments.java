import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int k = z*60*24;
        if((x*y)<=k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
