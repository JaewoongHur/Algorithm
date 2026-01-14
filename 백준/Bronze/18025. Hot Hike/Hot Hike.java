import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
	
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = Integer.MAX_VALUE;
		int idx = 0;
		
		for(int i=0;i<n-2;i++) {
			int a = Math.max(arr[i], arr[i+2]);
			
			if(a < min) {
				min = a;
				idx = i+1;
			}
		}
		
		System.out.println(idx + " " + min);
	}
}
