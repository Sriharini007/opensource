import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        Double x = s.nextDouble();
        Double y = s.nextDouble();
        Double z = s.nextDouble();
        if((x+y)<=z){
            System.out.println("2");
        }
        else if(x<=z){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
