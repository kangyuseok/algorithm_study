package wendy;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args)throws IOException{
        // 첫번째 줄 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken()); // 숫자갯수
        int Num = Integer.parseInt(st.nextToken()); // 넘지 않으면서 가까워야하는 수
        //두번째 줄 읽기
        StringTokenizer cards = new StringTokenizer(br.readLine());
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = Integer.parseInt(cards.nextToken()); // 배열에 카드들 집어넣기
        }
        int sum = 0;
        int ans_sum = 0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                for(int z=j+1; z<len; z++){
                    sum = arr[i]+arr[j]+arr[z];
                    if(ans_sum<sum && sum<=Num){
                        ans_sum = sum;
                    }
                }
            }
        }
        System.out.print(ans_sum);
    }
}
