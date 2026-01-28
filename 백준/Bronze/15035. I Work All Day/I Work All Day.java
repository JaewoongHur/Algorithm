import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		st = new StringTokenizer(br.readLine());

		int min = Integer.MAX_VALUE;
		int idx = 0;
		
		int[] h = new int[n];
		
		for(int i=0;i<n;i++) {
			h[i] = Integer.parseInt(st.nextToken());
		}
		
		int l = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			if(min > l%h[i]) {
				min = l%h[i];
				idx = h[i];
			}
		}
		
		System.out.println(idx);
	}
}
