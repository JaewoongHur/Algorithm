import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int x = (d-11)*24*60 + (h -11)*60 + m - 11;
        if(x<0){
            System.out.println(-1);
            }
        else{
           System.out.println(x); 
        }
      }
    }