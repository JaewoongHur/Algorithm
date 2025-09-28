import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] dollars = new int[n+1];
		
		int[] end = new int[n+1];
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			int[] s = new int[n+1];
			
			for(int j=1;j<=n;j++) {
				s[j] = Integer.parseInt(st.nextToken());
			}
			
			int min = Integer.MAX_VALUE;
			int idx = 0;
			
			for(int j=1;j<=n;j++) {
				if(end[j] > t) continue;
				
				if(min > s[j]) {
					min = s[j];
					idx = j;
				}
			}
			
			dollars[idx] += v;
			end[idx] = t+s[idx];
			
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(dollars[i] + " ");
		}
		
	}
}