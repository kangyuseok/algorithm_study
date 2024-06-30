package wendy;
import java.io.*;
import java.util.*;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();
        for(int i=0; i<len; i++){
            String command = br.readLine();
            if(command.equals("top")){
                if(stackInt.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stackInt.peek());
                }
            }else if(command.equals("size")){
                System.out.println(stackInt.size());
            }else if(command.equals("empty")){
                if(stackInt.empty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(command.equals("pop")){
                if(stackInt.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stackInt.pop());
                }
            }else{
                StringTokenizer st = new StringTokenizer(command);
                command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                stackInt.push(num);
            }
        }
    }
}