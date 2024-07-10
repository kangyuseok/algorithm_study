import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int ans = 0;

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        for(int i = 0; i<k; i++){
            ans = 0;
            st = new StringTokenizer(br.readLine());
            int startx = Integer.parseInt(st.nextToken()) - 1;
            int starty = Integer.parseInt(st.nextToken()) - 1;
            int endx = Integer.parseInt(st.nextToken()) - 1;
            int endy = Integer.parseInt(st.nextToken()) - 1;

            for(int j = startx; j<=endx; j++){
                for(int p = starty; p<=endy; p++){
                    ans += arr[j][p];
                }
            }
            System.out.println(ans);
        }

    }
}
