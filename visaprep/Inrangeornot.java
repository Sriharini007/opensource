import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int x = s.nextInt();
            if(x<=45000 &&x>=67){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
