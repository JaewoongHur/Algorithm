import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[101][101];
		
		for(int t=0; t<n;t++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			for(int i=a;i<=c;i++) {
				for(int j=b;j<=d;j++) {
					map[i][j]++;
				}
			}		
		}
		
		int ans = 0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++) {
				if(map[i][j]>m) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}