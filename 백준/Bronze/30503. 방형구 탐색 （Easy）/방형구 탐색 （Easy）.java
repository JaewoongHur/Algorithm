import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		int q = Integer.parseInt(br.readLine());
		
		for(int i=0;i<q;i++) {
			st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if(m == 1) {
				int k = Integer.parseInt(st.nextToken());
				
				int num = 0;
				
				for(int j=l;j<=r;j++) {
					if(k == arr[j]) {
						num++;
					}
				}
				sb.append(num).append('\n');			
			}else {
				Arrays.fill(arr, l, r+1, 0);
			}
		}
		System.out.println(sb);
	}
}