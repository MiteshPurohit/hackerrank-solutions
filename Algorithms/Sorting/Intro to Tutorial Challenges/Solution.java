import java.util.*;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 *
 * @author Darpan Dodiya
 */

public class Solution {
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.asList(arr).indexOf(V));
    }
    
}