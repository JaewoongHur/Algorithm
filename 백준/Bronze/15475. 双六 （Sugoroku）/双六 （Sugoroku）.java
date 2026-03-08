import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		
		int streak = 0;
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a == 1) {
				streak++;
			}else {
				max = Math.max(streak, max);
				streak = 0;
			}
		}
		
		max = Math.max(max, streak);
		
		System.out.println(max+1);
	}
}