import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				arr[j] = arr[j] + arr[j+1];
				sb.append(arr[j]).append(' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
