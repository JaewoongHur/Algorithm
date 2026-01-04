import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Practice #").append(tc).append(": ").append(a).append(' ').append(b).append('\n');
			
			int n = Integer.parseInt(br.readLine());
			
			for(int i=0;i<n;i++) {
				int k = Integer.parseInt(br.readLine());
				
				if(k < b) {
					b = b - k;
					sb.append(k).append(' ').append(b).append('\n');
				}else {
					while(b <= k) {
						b = 2 * b;
					}
					b = b - k;
					sb.append(k).append(' ').append(b).append('\n');
				}
			}
			sb.append('\n');
			
		}
		
		System.out.println(sb);
		
	}
}
