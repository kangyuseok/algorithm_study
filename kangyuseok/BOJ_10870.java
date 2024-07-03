import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int []fibo = new int[n+1];

        if(n== 0) System.out.println(0);
        else{
            fibo[0] = 0;
            fibo[1] = 1;
            for(int i=2;i<=n;i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            System.out.println(fibo[n]);
        }
    }
}
