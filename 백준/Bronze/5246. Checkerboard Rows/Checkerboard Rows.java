import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());

			boolean[][] arr = new boolean[9][9];

			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				arr[b][a] = true;
			}
			int max = 0;
			
			for(int i=1;i<9;i++) {
				int cnt = 0;
				for(int j=1;j<9;j++) {
					if(arr[i][j]) {
						cnt++;
					}
				}
				max = Math.max(max, cnt);
			}
			System.out.println(max);
		}
	}
}