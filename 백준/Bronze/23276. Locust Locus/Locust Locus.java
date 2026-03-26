import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		int[][] arr = new int[n][3];
		
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			int lcm = arr[i][1]*arr[i][2]/gcd(arr[i][1],arr[i][2]);
			
			min = Math.min(min, arr[i][0] + lcm);
		}
		
		System.out.println(min);
	}
	
	static int gcd(int a, int b) {
		int r = a % b;
		
		while(r!=0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}
}
