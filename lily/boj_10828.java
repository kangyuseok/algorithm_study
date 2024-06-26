import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int[] stack = new int[10000];
        int index = 0;

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            String commander = st.nextToken(); // push

            if(commander.equals("push")){
                int n = Integer.parseInt(st.nextToken()); // 1
                stack[index++] = n;
            } else if (commander.equals("pop")) {
                if (index == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[index - 1]);
                    stack[index - 1] = 0;
                    index--;
                }
            } else if (commander.equals("size")) {
                System.out.println(index);
            } else if (commander.equals("empty")) {
                if(index == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {
                if(index == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[index - 1]);
                }
            }
        }
    }
}
