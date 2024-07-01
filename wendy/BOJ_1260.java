package wendy;
import java.util.*;

public class BOJ_1260  {
    static int[][] check; // 간선 연결상태
    static boolean[] checked; // 확인여부
    static int n; // 정점 개수
    static int m; // 간선 개수
    static int start; // 시작정점
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        check = new int[n+1][n+1]; // 좌표 그대로 보기 위해
        checked = new boolean[n+1]; // 초기값 False

        // 간선 연결상태 저장
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            check[x][y] = check[y][x] = 1;
        }
        DFS(start); // DFS 호출

        checked = new boolean[n+1]; // 확인상태 초기화
        System.out.println();

        BFS();
    }
    // 시작점을 변수로 받음, 출력 후 다른 연결점을 찾아 시작점을 변경하여 재호출
    public static void DFS(int i){
        checked[i] = true;
        System.out.print(i + " ");

        for(int j=1; j<=n; j++){
            if(check[i][j] == 1 && checked[j]==false){
                DFS(j);
            }
        }
    }

    public static void BFS(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        checked[start] = true;
        System.out.print(start + " ");

        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int j=1; j<=n; j++){
                if(check[temp][j]==1 && checked[j]==false){
                    queue.offer(j);
                    checked[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
}
