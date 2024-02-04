package leetCodeChallenges.hackrank;

import java.util.List;

class DiagnolDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int primaryDiagnol= 0;
        int secondaryDiagnol = 0;

        for(int i =0; i<n; i++){
            primaryDiagnol += arr.get(i).get(i);
            secondaryDiagnol += arr.get(i).get(n-1-i);

        }
        return Math.abs(primaryDiagnol-secondaryDiagnol);


    }

}
