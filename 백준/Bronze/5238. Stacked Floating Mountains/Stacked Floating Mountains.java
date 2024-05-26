import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			boolean pass = true;
			
			for(int i=0;i<n-2;i++) {
				if(arr[i+2] != arr[i+1] + arr[i]) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				sb.append("YES").append('\n');
			}else {
				sb.append("NO").append('\n');
			}
		}
		System.out.println(sb);
	}
}