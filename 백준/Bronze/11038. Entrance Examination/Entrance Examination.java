import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0 0 0")) break;
			
			st = new StringTokenizer(s);
			
			int m = Integer.parseInt(st.nextToken());
			int nmin = Integer.parseInt(st.nextToken());
			int nmax = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[m+1];
			
			for(int i=1;i<=m;i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int max = 0;
			int idx = 0;
			for(int i=nmin;i<=nmax;i++) {
				int gap = arr[i] - arr[i+1];
				
				if(gap >= max) {
					max = gap;
					idx = i;
				}
			}
			System.out.println(idx);
		}
	}
}
