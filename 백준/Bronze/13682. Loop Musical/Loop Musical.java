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
			
			int[] arr = new int[n+2];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=1;i<n+1;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			arr[0] = arr[n]; arr[n+1] = arr[1];
			
			int cnt = 0;
			
			for(int i=1;i<n+1;i++) {
				if((arr[i-1] < arr[i] && arr[i] > arr[i+1])||(arr[i-1] > arr[i] && arr[i] < arr[i+1])) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	
	}
}
