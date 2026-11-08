package b_rank.B185;
import java.util.*;


        //入力
        // "12";
        // "LOVELOVELOVE";


public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String s = sc.nextLine().trim();

        String target = "LOVE";
        long[] dp = new long[target.length() + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            for (int j = target.length(); j >= 1; j--) {
                if (c == target.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        System.out.println(dp[target.length()]);
    }
}


// java b_rank/B185/Answer.java