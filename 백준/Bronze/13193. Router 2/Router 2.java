import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(2*n).append(' ').append(n*n).append('\n');
		
		for(int i=1;i<=n;i++) {
			for(int j=n+1;j<=2*n;j++) {
				sb.append(i).append(' ').append(j).append('\n');
			}
		}
		System.out.println(sb);
	}
}
