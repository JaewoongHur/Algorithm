import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		
		char[][] arr = new char[r][c];
		char[][] ans = new char[r*a][c*b];
		
		for(int i=0;i<r;i++) {
			String s = br.readLine();
			for(int j=0;j<c;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i=0;i<r*a;i++) {
			for(int j=0;j<c*b;j++) {
				ans[i][j] = arr[i/a][j/b];
			}	
		}

		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<r*a;i++) {
			for(int j=0;j<c*b;j++) {
				sb.append(ans[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}