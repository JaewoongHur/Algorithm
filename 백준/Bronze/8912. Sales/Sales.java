import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int tc=0;tc<T;tc++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	st = new StringTokenizer(br.readLine());
        	
        	int[] A = new int[n];
        	
        	for(int i=0;i<n;i++) {
        		A[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	int sum = 0;
        	
        	for(int i=1;i<n;i++) {
        		int cnt = 0;
        		for(int j=0;j<i;j++) {
        			if(A[i] >= A[j]) cnt++;
        		}       	
        		sum += cnt;
        	}
        	
        	System.out.println(sum);
        }
    }
}
