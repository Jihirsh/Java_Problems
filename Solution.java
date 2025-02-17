import java.util.*;

public class Solution {

    //main code
    public static String orlon (String input) {
        input = input.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        if ((vowelCount >= 2) && isSquareOfPrime(consonantCount)) {
            return "Qualify";
        } else {
            return "Disqualify";
        }
    }

    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean isSquareOfPrime(int N) {
        int sqrtN = (int) Math.sqrt(N);
        return (sqrtN * sqrtN == N) && isPrime(sqrtN);
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();

        //example 1
        String input1 = "Challenge";
        System.out.println(sol.orlon(input1));

        //example 2
        String input2 = "abcde";
        System.out.println(sol.orlon(input2));

        //example 3
        String input3 = "abcdef";
        System.out.println(sol.orlon(input3));
    }
}