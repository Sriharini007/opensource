import java.io.*;
import java.lang.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws java.lang.Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println((x-y)+1);
        }
        
    }
}
