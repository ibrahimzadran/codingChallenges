package leetCodeChallenges.hackrank;

import java.util.Collections;
import java.util.List;

public class miniMax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long sum = 0;

        for ( int num : arr){
            sum += num;
        }
        long minSum= sum - Collections.max(arr);
        long maxSum= sum - Collections.min(arr);

        System.out .println(minSum +" "+ maxSum);

    }
}
