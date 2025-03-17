import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] finished = new boolean[n+1];
		
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int day = 1;
		
		int[] ans = new int[n+1];
		
		for(int i=0;i<n;i++) {
			int tmp = -1;
			boolean deal = false;
			for(int j=1;j<=n;j++) {
				if(finished[j]) continue;
				
				if(tmp == -1) {
					tmp = j;
				}
				
				if(day >= arr[j]) {
					deal = true;
					finished[j] = true;
					ans[j] = day;
					break;
				}
			}		
			
			if(!deal) {
				ans[tmp] = day;
				finished[tmp] = true;
			}
			
			day++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=n;i++) {
			sb.append(ans[i] + " ");
		}
		
		System.out.println(sb);
	}
}