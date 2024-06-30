import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<28;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            
            arr.add(a);
        }

        for(int i = 0; i<30;i++){
            if(!arr.contains(i + 1)){
                System.out.println(i+1);
            }
        }
    }
}
