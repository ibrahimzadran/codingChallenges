package leetCodeChallenges;

public class PalindromeNo9 {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original = x;
        int reversed = 0;

        while(x>0){
            reversed = reversed *10+x%10;
            x/=10;
        }
        return original == reversed;
    }
}
