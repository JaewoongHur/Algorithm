import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc=0;tc<T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
				
			int min = Integer.MAX_VALUE;	
					
			for(int i=0;i<n;i++) {
				int a = Integer.parseInt(st.nextToken());
				if(a == -1) continue;
				min = Math.min(a, min);
			}
			
			int x = 0;
			
			if(min == Integer.MAX_VALUE) {
				x = l;
			}else if(m - min <= l) {
				x = l;
			}else {
				x = m - min;
			}
			
			sb.append("The scoreboard has been frozen with ");
			
			if(x == 1) {
				sb.append(x).append(" minute ");
			}else {
				sb.append(x).append(" minutes ");
			}
			
			sb.append("remaining.\n");
		}
		System.out.println(sb);
	}
}