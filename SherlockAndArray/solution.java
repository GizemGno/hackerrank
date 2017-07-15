import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for(int i=0; i<t; i++) {
        int n = scan.nextInt();

        if(n == 1) {
            
            System.out.println("YES");
            scan.nextInt();
        }
        else if(n == 2) {
            System.out.println("NO");
            scan.nextInt();
            scan.nextInt();
        }
        else {
            int[] arr = new int[n];
            int total_sum = 0;
            for(int j=0; j<n; j++) {
                arr[j] = scan.nextInt();
                total_sum += arr[j];
            }
            int right_sum = arr[0];
            for(int j=1; j<n; j++) {
                
                if(right_sum == (total_sum-right_sum-arr[j])) {
                    System.out.println("YES");
                    break;
                }
                else if(j == n-1)
                    System.out.println("NO");
                    
                right_sum += arr[j];
            }
        }
    }
        
    }
}
