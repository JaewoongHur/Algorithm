import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] cnt = new int[1001];
        
        int sum = 0;
        
        for(int i=0;i<10;i++) {
        	int a = Integer.parseInt(br.readLine());
        	
        	sum += a;
        	
        	cnt[a]++;
        }
        
        int max = 0;
        int many = 0;
        
        for(int i=0;i<1001;i++) {
        	if(cnt[i]>max) {
        		max = cnt[i];
        		many = i;
        	}
        }
        
        System.out.println(sum/10);
        System.out.println(many);
    }
}