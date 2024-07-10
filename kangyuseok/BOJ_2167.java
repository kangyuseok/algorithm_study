import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][]arr = new int[n+1][m+1];
        int [][] psum= new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=m;j++){
                psum[i][j] += psum[i][j-1] +psum[i-1][j]-psum[i-1][j-1] + arr[i][j];
            }
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            System.out.println(psum[endX][endY] - psum[startX-1][endY] - psum[endX][startY-1] + psum[startX-1][startY-1]);
        }

    } 
}
