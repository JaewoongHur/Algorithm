import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int tc=1;tc<=T;tc++) {
			int c = Integer.parseInt(br.readLine());
			
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i] + arr[j] == c) {
						System.out.println("Case #" + tc +": " + (i+1) + " " + (j+1));
					}
				}
			}
		}
		
	}
}
