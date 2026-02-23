import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
	
		for(int tc=0;tc<n;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int w = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[m];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<m;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int s = 0;
			int cnt = 0;
			
			for(int i=m-1;i>=0;i--) {
				cnt++;
				s += arr[i];
				
				if(s >= w) break;
			}
			
			if(s >=w) {
				System.out.println(cnt);
			}else {
				System.out.println("no rest for Ruben");
			}
		}
	}
}
