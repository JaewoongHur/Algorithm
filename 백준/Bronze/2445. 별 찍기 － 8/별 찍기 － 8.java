import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		char[][] arr= new char[2*n-1][2*n];
		
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n;j++) {
				if(i<n) {
					if(j<=i) {
						arr[i][j] = '*';
						arr[i][2*n-1-j] = '*';
					}
				}
				else {
					if(j<=2*n-2-i) {
						arr[i][j] = '*';
						arr[i][2*n-1-j]='*';
					}
			
				}
			}
		}
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n;j++) {
				if(arr[i][j]=='*') {
				sb.append(arr[i][j]);
				}
				else {
					sb.append(' ');
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}