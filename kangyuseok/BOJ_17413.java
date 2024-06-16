import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        String s = br.readLine();

        boolean isTag = false;

        String ans = "";

        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='<'){
                StringBuffer teemp = new StringBuffer(temp);
                ans+=teemp.reverse().toString();
                temp="";
                isTag=true;
            }
            else if(s.charAt(i)==' '){
                StringBuffer teemp = new StringBuffer(temp);
                ans+=teemp.reverse().toString();
                ans+=" ";
                temp="";
                continue;
            }

            if(isTag){
                ans+=s.charAt(i);

                if(s.charAt(i)=='>')isTag=false;
                continue;
            }
            else{
                temp+=s.charAt(i);
            }
        }
        StringBuffer teemp = new StringBuffer(temp);
        ans+=teemp.reverse().toString();

        System.out.println(ans);
    }
}
