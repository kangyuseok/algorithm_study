import java.io.*;

public class boj_1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int[][] arr = new int[a][a];
        int x = -1, y = 0;
        int cnt = a;
        int num = a*a;

        for (int i = (a+1)/2; i > 0; i--) {
            for (int j = cnt; j > 0; j--) {
                arr[++x][y] = num--;
            }
            cnt--;
            for (int j = cnt; j > 0; j--) {
                arr[x][++y] = num--;
            }
            for (int j = cnt; j > 0; j--) {
                arr[--x][y] = num--;
            }
            cnt--;
            for (int j = cnt; j > 0; j--) {
                arr[x][--y] = num--;
            }
        }
        int n = 0, m = 0;

        for (int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                if(b == arr[i][j]){
                    n = i+1;
                    m = j+1;
                }
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.write(n + " " + m);
        bw.flush();
        bw.close();
    }
}
