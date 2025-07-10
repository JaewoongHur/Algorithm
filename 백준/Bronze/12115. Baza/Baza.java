import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int q = Integer.parseInt(br.readLine());
		
		for(int k=0;k<q;k++) {
			st = new StringTokenizer(br.readLine());
			int[] query = new int[m];
			
			for(int i=0;i<m;i++) {
				query[i] = Integer.parseInt(st.nextToken());
			}
			
			int ans = 0;
			
			out: for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(query[j] == -1) continue;
					
					if(query[j] != arr[i][j]) {
						continue out;
					}
				}
				ans++;
			}
			System.out.println(ans);
		}
	}
}
