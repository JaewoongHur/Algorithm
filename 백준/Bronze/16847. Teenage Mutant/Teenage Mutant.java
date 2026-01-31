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
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			String a = br.readLine();
			
			char[][] arr = new char[n][k];
			
			for(int i=0;i<n;i++) {
				String b = br.readLine();
				for(int j=0;j<k;j++) {
					arr[i][j] = b.charAt(j);
				}
			}
			
			int cnt = 0;
			
			for(int i=0;i<k;i++) {
				for(int j=0;j<n;j++) {
					if(arr[j][i] == a.charAt(i)) {
						cnt++;
						break;
					}
				}
			}
			
			sb.append("Data Set ").append(tc).append(':').append('\n');
			sb.append(k-cnt).append('/').append(k).append("\n\n");
			
		}
		
		System.out.println(sb);
	
	}
}
