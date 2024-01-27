package leetCodeChallenges.hackrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class plusMinus {
        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int positiveCount = 0;
            int negativeCount= 0;
            int zeroCount = 0;

            for(int n : arr){
                if(n > 0){
                    positiveCount++;
                }else if(n==0){
                    zeroCount++;
                }else {
                    negativeCount++;
                }
            }

            int size = arr.size();
            System.out.println((double)positiveCount / size);
            System.out.println((double)negativeCount / size);
            System.out.println((double)zeroCount/size);

        }

    }

