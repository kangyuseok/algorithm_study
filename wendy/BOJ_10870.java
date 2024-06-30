package wendy;
import java.util.Scanner;

public class BOJ_10870 {
    public static void main(String[] args) {
        int before_num = 0;
        int num = 1;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if(count > 1){
            for(int i=0; i<count-1; i++){ // count보다 하나 적게 해야 n번째 수를 구할 수 있음
                sum = before_num + num;
                before_num = num;
                num = sum;
            }
        }else if(count ==1){
            sum = 1;
        }else{
            sum = 0;
        }
        System.out.println(sum);
    }
}
