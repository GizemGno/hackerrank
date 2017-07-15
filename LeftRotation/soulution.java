import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int order = in.nextInt();
        
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++) {
            if(order > i) {
                arr[size-order+i] = in.nextInt();
            }
            else {
                arr[i-order] = in.nextInt();
            }
        }
        
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+ " ");
    }
}
