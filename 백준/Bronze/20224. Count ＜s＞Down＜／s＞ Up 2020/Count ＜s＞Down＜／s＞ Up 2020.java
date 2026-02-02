import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) break;
			
			int n = Integer.parseInt(s);
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			
			for(int i=0;i<n-3;i++) {
				if(arr[i] == 2 && arr[i+1] == 0 && arr[i+2] == 2 && arr[i+3] == 0) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
}
