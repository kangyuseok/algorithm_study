package somin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_5597 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        for (int i=1; i<=30; i++) {
            list.add(i);
        }

        for (int i=0; i<28; i++) {
            list.remove((Integer) Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
