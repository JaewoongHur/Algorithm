import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        long cnt = 5;
        
        for(int i=2;i<=n;i++) {
        	cnt+= 5*i - 1- 2*(i-1);
        	cnt%=45678;
        }
        System.out.println(cnt);
    }  
}