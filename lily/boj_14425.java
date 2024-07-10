import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        Set<String> str1 = new HashSet<>();

        for(int i=0;i<n;i++){
            str1.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            String str2 = br.readLine();
            if(str1.contains(str2)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
