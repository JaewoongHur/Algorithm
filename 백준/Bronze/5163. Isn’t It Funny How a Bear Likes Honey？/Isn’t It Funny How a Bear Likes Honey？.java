import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			double w = Double.parseDouble(st.nextToken());
			
			double sum = 0;
			
			for(int i=0;i<n;i++) {
				double r = Double.parseDouble(br.readLine());
				sum += 4*Math.PI*Math.pow(r, 3)/3000;
			}
			
			sb.append("Data Set ").append(tc).append(":\n");
			
			if(sum >= w) {
				sb.append("Yes\n\n");
			}else {
				sb.append("No\n\n");
			}
			
		}
		System.out.println(sb);
	}
}