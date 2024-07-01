import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2798 {
    public static int len, num, ans;
    public static int[] arr;
    public static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        len = Integer.parseInt(st.nextToken()); //5
        num = Integer.parseInt(st.nextToken()); //21

        arr = new int[len]; // 1 2 3 4 5
        check = new boolean[len];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<len;i++){
            int number = Integer.parseInt(st.nextToken());

            arr[i] = number;
        }

        combi(0, 0, 0);

        System.out.println(ans);
    }

    public static void combi(int cnt, int start, int sum) {
        if(cnt == 3){ // 카드 3장을 뽑을 시 최대값 갱신
            if(sum <= num && sum > ans){
                ans = sum;
            }
            return;
        }
        for(int i=start; i<len;i++){
            if(check[i]){
                continue;
            }
            check[i] = true; // 카드를 뽑음
            combi(cnt+1, i+1, sum+arr[i]);
            check[i] = false;
        }
    }
}
