import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		char[][] arr= new char[2*n-1][2*n-1];
		
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n-1;j++) {
				if(i<n) {
					if(j>=i && j<=2*n-2-i) {
						arr[i][j] = '*';
					}
				}
				else {
					if(j>=2*n-2-i && j<=i) {
						arr[i][j] = '*';
					}
			
				}
			}
		}
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<2*n-1;j++) {
				if(arr[i][j]=='*') {
				sb.append(arr[i][j]);
				}
				else {
					if(j>n) continue;
					sb.append(' ');
				}
			}
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
}