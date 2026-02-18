import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int a = 0;
			
			for(int j=0;j<n;j++) {
				int k = Integer.parseInt(st.nextToken());
				
				a++;
				
				if(a == k) {
					a++;
				}
			}
			
			System.out.println(a);
		}
		
	}
}
