import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static ArrayList<Integer>[]list;
    static boolean []chk;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];
        chk = new boolean[n+1];

        for(int i = 0;i<=n;i++)list[i] = new ArrayList<>();

        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        
        for(int i=0;i< list.length;i++)Collections.sort(list[i]);

        dfs(v);
        Arrays.fill(chk, false);
        System.out.println();
        bfs(v);
    }
    static void dfs(int v){
        chk[v] =true;
        System.out.print(v+ " ");
        for(int a : list[v]){
            if(chk[a] ==false){
                dfs(a);
            }
        }
    }
    static void bfs(int v){
        Queue<Integer>q = new LinkedList<>();
        q.add(v);
        chk[v] = true;
        while(!q.isEmpty()){
            int cur = q.peek();
            System.out.print(cur + " ");
            q.remove();
            for(int a : list[cur]){
                if(chk[a]== false){
                    q.add(a);
                    chk[a]=true;
                }
            }
        }
    }
    
}
