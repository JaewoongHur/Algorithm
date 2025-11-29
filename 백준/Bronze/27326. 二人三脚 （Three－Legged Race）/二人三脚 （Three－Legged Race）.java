import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		st = new StringTokenizer(br.readLine());
		
		boolean[] check = new boolean[n+1];
		
		for(int i=0;i<2*n-1;i++) {
			int a = Integer.parseInt(st.nextToken());
			check[a] = !check[a];
		}
		
		int ans = 0;
		
		for(int i=1;i<=n;i++) {
			if(check[i]) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
		
	}
}
