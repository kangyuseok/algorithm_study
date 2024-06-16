package wendy;

import java.util.*;

public class BOJ_14916 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = 0;
        
        if (money < 0 || money == 1 || money == 3) {
            System.out.println("-1");
            return;
        }
        while(money > 0){
            if(money%5 == 0){
                count += money/5;
                money = money%5;
                break;
            }
            else{
                money = money-2;
                count++;
                if(money<0){
                    System.out.print("-1");
                }
            }
        }
        System.out.print(count);
    }
}