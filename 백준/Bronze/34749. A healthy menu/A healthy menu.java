import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] max = new int[m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<m;j++) {
				int a = Integer.parseInt(st.nextToken());
				if(max[j] < a) {
					max[j] = a;
				}
			}
		}
	
		int sum = 0;
		
		for(int i=0;i<m;i++) {
			sum += max[i];
		}
		System.out.println(sum);
	}
}
