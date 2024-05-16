import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s;
		
		int tc = 1;

		while (true) {
			s = br.readLine();

			if (s.equals("0")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			st = new StringTokenizer(br.readLine());
			
			int[] A = new int[n];
			
			int z = 0;
			
			for(int i=0;i<n;i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			z = A[0];
			
			sb.append("Case ").append(tc).append(": ");
			
			int cnt = 0; 
			
			while(true) {
				if(cnt>1000) {
					sb.append("not attained").append('\n');
					break;
				}
				
				boolean pass = true;
				
				for(int i=1;i<n;i++) {
					if(A[i] != A[0]) {
						pass = false; 
						break;
					}
				}
				
				if(pass) {
					sb.append(cnt).append(" iterations").append('\n');
					break;
				}
				
				z = A[0];
				for(int i=0;i<n-1;i++) {
					A[i] = Math.abs(A[i]-A[i+1]);
				}
				
				A[n-1] = Math.abs(A[n-1]-z);
				
				cnt++;
			}
			
			tc++;
		}

		System.out.println(sb);

	}
}