import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
private static int []cards;
    private static boolean[]check;
    private static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        cards = new int[n];
        check = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            cards[i]= Integer.parseInt(st.nextToken());

        sol(0, 0, m);

        System.out.println(answer);


    }
    private static void sol(int cnt, int sum, int limit){
        if(cnt == 3){
            if(sum > limit)return;
            answer = Math.max(answer, sum);
            return;
        }

        for(int i=0;i<cards.length;i++){
            if(!check[i]){
                check[i]=true;
                sol(cnt+1, sum+cards[i], limit);
                check[i]=false;
            }
        }
    }    
}
