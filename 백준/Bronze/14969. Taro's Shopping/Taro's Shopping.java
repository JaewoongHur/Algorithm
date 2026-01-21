import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0")) break;
			
			st = new StringTokenizer(s);
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = -1;
			
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					int a = arr[i] + arr[j];
					
					if(a > m) continue;
					
					if(a > max) {
						max = a;
					}
				}
			}
			
			if(max == -1) {
				System.out.println("NONE");
			}else {
				System.out.println(max);
			}
			
		}
		
	}
}
