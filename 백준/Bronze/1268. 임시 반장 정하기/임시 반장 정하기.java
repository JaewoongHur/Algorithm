import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][5];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		boolean[][] check = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<5;j++) {
				int tmp = arr[i][j];
				for(int k=0;k<N;k++) {
					if(tmp==arr[k][j]) {
						check[i][k] = true;
					}
				}
			}
		}
		
		int max = -1;
		int ans = 0;
		for(int i=0;i<N;i++) {
			int cnt = 0;
			for(int j=0;j<N;j++) {
				if(check[i][j]) {
					cnt++;
				}
			}
			if(max < cnt) {
				max = cnt;
				ans = i+1;
			}
		}
		System.out.println(ans);
	}
}