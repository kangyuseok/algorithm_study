import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        StringBuilder build = new StringBuilder();

        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            if(token.length() > 0){
                build.append(token.charAt(0));
            }
        }
        System.out.println("build : " + build.toString().toUpperCase());
    }
}