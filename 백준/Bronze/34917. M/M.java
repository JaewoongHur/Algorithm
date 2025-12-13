import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc=0;tc<T;tc++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(j==0 || j==n-1) {
						sb.append('#');
					}else {
						if(i==j && i<=n/2) {
							sb.append('#');
						}else if(i+j==n-1 && j>n/2) {
							sb.append('#');
						}else {
							sb.append('.');
						}
					}
				}
				sb.append('\n');
			}
		}
		System.out.println(sb);
		
	}
}
