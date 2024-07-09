package wendy;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2167 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        StringTokenizer st = new StringTokenizer(size);
        int line = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int[][] arr = new int[line][row];
        // 2차원 배열 만들기
        for(int i=0; i<line; i++){
            String input = br.readLine();
            st = new StringTokenizer(input);
            for(int j=0; j<row; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++){
            int sum = 0;
            // 합을 구할 부분 가져온 뒤 각각 (x1, y1) (x2, y2)가 되도록 만듦
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 배열의 합 구하기
            for(int j=x1; j<=x2; j++){
                for(int z=y1; z<=y2; z++){
                    sum += arr[j-1][z-1];
                }
            }
            System.out.println(sum);
        }
    }
}
