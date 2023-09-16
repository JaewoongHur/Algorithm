import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		char[][] star = new char[2*n-1][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<n-1) {
					star[i][j] = ' ';
					continue;
				}
				star[i][j] = '*';
			}
		}
		
		for(int i=n;i<2*n-1;i++) {
			for(int j=0;j<n;j++) {
				if(j>=i-n+1) {
					star[i][j] = '*';
				}
				else {
					star[i][j] = ' ';
				}
			}
		}
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<n;j++) {
				sb.append(star[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}