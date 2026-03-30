import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0 0 0")) break;
			
			st = new StringTokenizer(s);
			
			int cnt = 0;
			
			int[] arr = new int[4];
			
			for(int i=0;i<4;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i] != 0) {
					cnt++;
				}
			}
			
			while(true) {
				if(cnt == 1) {
					Arrays.sort(arr);
					System.out.println(arr[3]);
					break;
				}
				
				int min = Integer.MAX_VALUE;
				int idx = 0;
				
				for(int i=0;i<4;i++) {
					if(arr[i] == 0) continue;
					if(min > arr[i]) {
						idx = i;
						min = arr[i];
					}
				}
				
				for(int i=0;i<4;i++) {
					if(arr[i] == 0 || i == idx) continue;
					arr[i] -= arr[idx];
					
					if(arr[i] == 0) {
						cnt--;
					}
				}
				
			}
			
		}
	}
}
