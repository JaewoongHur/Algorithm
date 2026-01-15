import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int k = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i == x && j == y) continue;
				
				int d = Math.abs(i-x) + Math.abs(j-y);
				
				if(d <= k) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
