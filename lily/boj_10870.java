import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num + 1];

        if(num == 0){
            System.out.println(0);
        } else if(num == 1) {
            System.out.println(1);
        } else if(num > 1) {
            arr[0] = 0;
            arr[1] = 1;

            for (int i = 2; i < num + 1; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.println(arr[num]);
        }
    }
}
