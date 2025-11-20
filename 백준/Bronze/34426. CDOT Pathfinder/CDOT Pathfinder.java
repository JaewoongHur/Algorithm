import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int m = Integer.parseInt(br.readLine());
			
			double[] arr = new double[m];
			
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				double a = Double.parseDouble(st.nextToken());
				double b = Double.parseDouble(st.nextToken());
				
				arr[j] = b/a;
			}
			
			double min = Double.MAX_VALUE;
			int idx = 0;
			
			for(int j=0;j<m;j++) {
				if(min >  arr[j]) {
					min = arr[j];
					idx = j+1;
				}
			}
			sb.append(idx).append('\n');
		}
		
		System.out.println(sb);
	}
}
