package wendy;

import java.util.Scanner;

public class BOJ_1343 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // 간단한 풀이
        // input = input.replaceAll("XXXX", "AAAA");
        // input = input.replaceAll("XX", "BB");
        // if(input.contains("X")){
        //     System.out.print("-1");
        // }else{
        //     System.out.print(input);
        // }
        // 내 풀이
        String[] str_X = input.split("(?<=\\.)|(?=\\.)");
        String ans_str= "";
        int count=0;
        int len = str_X.length;
        for(int i=0; i<len; i++){
            int get_len = str_X[i].length();
            if(str_X[i].equals(".")){
                ans_str += ".";
            }else if(get_len % 2 == 0){
                count = get_len/4;
                while(count>0){
                    ans_str += "AAAA";
                    count--;
                }
                if(get_len % 4 != 0){
                    ans_str += "BB";
                }
            }else{
                ans_str = "-1";
                break;
            }
        }
        System.out.print(ans_str);
    }
}