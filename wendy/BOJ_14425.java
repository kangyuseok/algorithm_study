package wendy;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int get_len = Integer.parseInt(st.nextToken());  // 집합 S의 길이
        int check_len = Integer.parseInt(st.nextToken());  // 비교할 문자열 개수
        String[] S = new String[get_len];  // get_len 크기의 집합

        // 집합에 받아온 문자열 삽입 
        for(int i=0; i<get_len; i++){
            S[i] = br.readLine();
        }

        for(int i=0; i<check_len; i++){
            String now_String = br.readLine();
            for(int j=0; j<get_len; j++){
                if(S[j].equals(now_String)){
                    count++;  // 입력받은 문자열과 S에 있는 문자열이 같은게 있다면 count를 1 더함
                }
            }
        }
        System.out.print(count);

    }
}