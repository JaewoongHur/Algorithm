import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) break;
			
			int n = Integer.parseInt(s);
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int min = Integer.MAX_VALUE;
			
			for(int i=1;i<n;i++) {
				min = Math.min(min, arr[i] - arr[i-1]);
			}
			
			sb.append(min).append('\n');
		}
		
		System.out.println(sb);
	
	}
}
