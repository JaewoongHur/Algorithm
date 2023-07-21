import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());

        long a = 0;

        a = (long) Math.sqrt(S);

        while(a*(a+1)/2 <= S){
               a++;
        }
        System.out.println(a-1);
    }
}