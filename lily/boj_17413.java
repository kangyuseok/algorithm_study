import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean check = false;

        //특수기호 <,> 먼저 확인후 공백으로 나누기
        //<를 만나면 >를만날때까지 나누지 않고 뒤집지도 않음
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == '<'){
                // 태그를 만나기 전까지의 단어들을 뒤집어서 출력
                ans.append(new StringBuilder(word.toString()).reverse().toString());
                word = new StringBuilder(); // 초기화
                check = true; // 태그 안에 있는 상태로 변경
                ans.append(str1.charAt(i)); // 꺽새넣어
            }
            else if(str1.charAt(i) == '>'){
                check = false; // 태그 끝남
                ans.append(str1.charAt(i)); // 꺽새넣어
            }
            else if(str1.charAt(i) == ' '){ // 공백일때
                ans.append(new StringBuffer(word.toString()).reverse().toString()); // 뒤집어
                word = new StringBuilder(); // 초기화
                ans.append(' '); // 공백도 추가해줘
            }
            else if(check) { // 태그 안에 있는 경우 그대로 단어에 추가
                ans.append(str1.charAt(i));
            }
            else {
                word.append(str1.charAt(i));
            }
        }
        // 남은 단어들 뒤집어서 결과 추가
        ans.append(new StringBuilder(word.toString()).reverse().toString());

        System.out.println(ans);
    }
}