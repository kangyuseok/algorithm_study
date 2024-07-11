import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int []dp = new int[100001];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            if (i %2== 0 && i % 3 == 0)
                dp[i] = Math.min(Math.min(dp[i - 1], dp[i / 2]), dp[i / 3]) + 1;
            else if (i % 3 == 0)
                dp[i] = Math.min(dp[i - 1], dp[i / 3]) + 1;
            else if (i % 2 == 0)
                dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
            else dp[i] = dp[i - 1] + 1;
        }

        System.out.println(dp[n]);

    }
    
}
