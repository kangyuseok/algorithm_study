package wendy;
import java.io.*;

public class BOJ_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        dp[1] = 0; // 1은 이미 1이므로 연산이 필요 없음

        for (int i = 2; i <= n; i++) {
            // 기본적으로 i-1에서 1을 더한 값을 설정
            dp[i] = dp[i - 1] + 1;

            // i가 2로 나누어 떨어지면, 나누었을 때의 값과 비교하여 더 작은 값으로 설정
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // i가 3으로 나누어 떨어지면, 나누었을 때의 값과 비교하여 더 작은 값으로 설정
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[n]); // n을 1로 만드는 데 필요한 최소 연산 횟수 출력
    }
}
