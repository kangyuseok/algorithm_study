import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while(a > 1){
            if(a%5 == 0){
                a -= 5;
            }else{
                a -= 2;
            }
            cnt++;
        }

        if(a==1) {
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }
    }
}
