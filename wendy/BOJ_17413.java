package wendy;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_17413{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");

        Stack<String> stack = new Stack<String>();
        boolean reverse = true;
        for(int i=0; i<str.length; i++){
            if(str[i].equals("<")){
                reverse = false;
                print(stack);
                System.out.print(str[i]);
            }else if(str[i].equals(">")){
                reverse = true;
                System.out.print(str[i]);
            }else if(!reverse){
                System.out.print(str[i]);
            }else{
                if(str[i].equals(" ")){
                    print(stack);
                    System.out.print(str[i]);
                }else{
                    stack.push(str[i]);
                }
            }
        }
        print(stack);
    }
    static void print(Stack<String> stack){
        while(!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}