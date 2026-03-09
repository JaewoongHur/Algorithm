import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		String[] name = new String[n];
		int[] solved = new int[n];
		int[] penalty = new int[n];
		
		int idx = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			name[i] = st.nextToken();
			
			
			for(int j=0;j<4;j++) {
				int s = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				
				if(t == 0) continue;
				
				solved[i]++;
				penalty[i] += t + 20 * (s-1);
			}
			
			if(max < solved[i]) {
				max = solved[i];
			}
		}
		
		for(int i=0;i<n;i++) {
			if(solved[i] == max) {
				if(min > penalty[i]) {
					idx = i;
					min = penalty[i];
				}
			}
		}
		
		System.out.println(name[idx] + " " + solved[idx] + " " + penalty[idx]);
	}
}
