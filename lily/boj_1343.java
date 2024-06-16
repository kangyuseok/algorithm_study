import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] arr = st.nextToken().toCharArray(); // string을 char로 변환

        int cnt = 0;
        boolean answer = false;

        for(int i = 0; i<arr.length; i++) {
            if (arr[i] == 'X'){
                cnt++;
            }
            if (arr[i] == '.') {
                if(cnt % 2 == 0){
                    // 0일 때 그냥 넘어가
                    if(cnt == 0){
                        continue;
                    } else {
                        for(int j = i-1; j >= i-cnt; j--) {
                            arr[j] = 'A';
                        }
                        if(cnt % 4 != 0){
                            arr[i-1] = 'B';
                            arr[i-2] = 'B';
                        }
                    }
                }else{
                    answer = true;
                    System.out.println(-1);
                    break;
                }
                cnt = 0;
            }
            if (i == arr.length - 1) {
                if(cnt % 2 == 0){
                    // 0일 때 그냥 넘어가
                    if(cnt == 0){
                        continue;
                    }
                    for (int j = i; j > i - cnt; j--) {
                        arr[j] = 'A';
                    }
                    if (cnt % 4 != 0) {
                        arr[i] = 'B';
                        arr[i - 1] = 'B';
                    }
                }else{
                    answer = true;
                    System.out.println(-1);
                    break;
                }
            }
        }
        if(!answer){
            System.out.println(arr);
        }
    }
}
