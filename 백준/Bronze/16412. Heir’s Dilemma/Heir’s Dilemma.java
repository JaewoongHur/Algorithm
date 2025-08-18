import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int ans = 0;
		
		c:for(int i=n;i<=m;i++) {
			int a = i;
			String s = String.valueOf(i);
			boolean[] check = new boolean[10];
			
			for(int j=0;j<6;j++) {
				if(s.charAt(j)=='0') continue c;
				
				if(check[s.charAt(j)-'0']) continue c;
				check[s.charAt(j)-'0'] = true;
				
				if(a%(s.charAt(j)-'0')!=0) continue c;
			}
			
			ans++;
		}
		System.out.println(ans);
	}
}