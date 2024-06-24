package wendy;
import java.io.*;

public class BOJ_1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int want_num = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int value = 1;
        int move = 1;
        int x = n/2;
        int y = n/2;
        
        while(true){
            for(int i=0; i<move; i++){
                arr[x--][y] = value++;
            }
            if(value == n*n + 1) break;
            
            for(int i=0; i<move; i++){
                arr[x][y++] = value++;
            }
            move++;

            for(int i=0; i<move; i++){
                arr[x++][y] = value++;
            }
            
            for(int i=0; i<move; i++){
                arr[x][y--] = value++;
            }
            move++;
        }
            int a=0;
            int b=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    bw.write(arr[i][j]+" ");
                    if(want_num == arr[i][j]){
                        a = i+1;
                        b = j+1;
                    }
                }
                bw.newLine();
            }
            bw.write(a+" "+b);
            bw.flush();
            bw.close();
        }
    }