package wendy;
import java.io.*;

public class BOJ_5597 {
    public static void main(String[] args) throws IOException{
        int num = 0;
        int[] num_arr = new int[30];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<28; i++){
            num = Integer.parseInt(br.readLine());
            num_arr[num-1] = 1;
        }
        for(int i=0; i<30; i++){
            if(num_arr[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}