import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_1260 {
    public static int vertex, edge, start;
    public static List<Integer>[] list;
    public static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        list = new List[vertex + 1];
        check = new boolean[vertex + 1];

        for(int i = 0; i<vertex + 1; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        for(int i = 0; i<vertex + 1; i++){
            Collections.sort(list[i]);
        }

        dfs(start, 0);
        System.out.println();
        Arrays.fill(check, false);
        bfs(start);

    }

    public static void dfs(int start, int cnt){
        if(cnt == vertex){
            return;
        }
        System.out.print(start + " ");
        check[start] = true;
        for(int i: list[start]){
            if(check[i]){
                continue;
            }
            dfs(i, cnt + 1);
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){
            int currentVertex = q.peek();
            System.out.print(currentVertex + " ");
            q.remove();

            for(int i : list[currentVertex]){
                if(check[i])continue;
                check[i]=true;
                q.add(i);
            }
        }
    }
}
