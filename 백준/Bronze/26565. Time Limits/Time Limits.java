import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<t;tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			double max = 0;
			
			for(int i=0;i<n;i++) {
				double a = Double.parseDouble(st.nextToken());
				if(max < a) {
					max = a;
				}
			}
			
			System.out.println((int) Math.ceil(max * s / 1000));
			
		}
		
	}
}
