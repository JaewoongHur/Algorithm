import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int tc = 0;
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			tc++;
			
			double min = Double.MAX_VALUE;
			int menu = 0;
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());

				int d = Integer.parseInt(st.nextToken());
				double c = Double.parseDouble(st.nextToken());
				
				double cpi = 400 * c / (Math.PI * d * d);
				
				if(min > cpi) {
					min = cpi;
					menu = d;
				}
			}
			System.out.println("Menu " + tc + ": " + menu);
		}
	}
}