import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int m = Integer.parseInt(br.readLine());
			
			int[] arr = new int[m];
			int[] arr2 = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr2[j] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			for(int j=0;j<m;j++) {
				if(arr[j]!=arr2[j]) {
					cnt++;
				}
			}
			
			sb.append(cnt).append('\n');
			
		}
		System.out.println(sb);
	}
}
