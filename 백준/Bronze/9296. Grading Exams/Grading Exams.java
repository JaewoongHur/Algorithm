import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			int n = Integer.parseInt(br.readLine());
			
			String a = br.readLine();
			String b = br.readLine();
			
			int count = 0;
			
			for(int i=0;i<n;i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					count++;
				}
			}
			
			sb.append("Case ").append(tc+1).append(": ").append(count).append('\n');
			
		}
		
		System.out.println(sb);
		
	}
}
