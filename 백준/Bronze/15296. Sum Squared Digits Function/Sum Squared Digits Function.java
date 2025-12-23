import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int k = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			while(true) {
				if(n == 0) {
					break;
				}
				
				sum += (n % b) * (n % b);
				n = (n - n % b)/b;
			}
			
			System.out.println(k + " " + sum);
			
		}

	}
}
