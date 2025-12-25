import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringTokenizer st2;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[13];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			
			st2 = new StringTokenizer(st.nextToken(), "/");
			
			st2.nextToken();
			
			cnt[Integer.parseInt(st2.nextToken())]++;
			
		}
		
		for(int i=1;i<=12;i++) {
			System.out.println(i + " " + cnt[i]);
		}
		
	}
}
