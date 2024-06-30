import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class BOJ_1913 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int key = Integer.parseInt(st.nextToken());

        int[][]arr = new int[n+1][n+1];

        int cnt = n*n;

        int x = 1;
        int y = 1;

        int idx=0;
        int []dx = {1, 0, -1, 0};
        int []dy = {0, 1, 0, -1};

        int []ans = new int[2];
        while(cnt>0){

            arr[x][y] = cnt;
            if(cnt == key){
                ans[0] = x;
                ans[1] = y;
            }

            if(dx[idx]+x <= 0 || dy[idx]+y <= 0 || dx[idx]+x > n || dy[idx]+y > n || arr[dx[idx]+x][dy[idx]+y] != 0){
                idx++;
                idx = idx % 4;
            }

            x+=dx[idx];
            y+=dy[idx];
            cnt--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append('\n');
        }
        sb.append(ans[0]+" "+ans[1]);

        System.out.println(sb);
    }
}


