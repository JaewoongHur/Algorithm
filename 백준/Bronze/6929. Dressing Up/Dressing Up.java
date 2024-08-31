import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] arr = new char[n][2*n];
		
		for(int i=0;i<=n/2;i++) {
			for(int j=0;j<2*n;j++) {
				if(j>2*i && j<2*n-1-2*i) {
					arr[i][j] = ' ';
				}else {
					arr[i][j] = '*';
				}				
			}			
		}
		
		for(int i= n/2+1;i<n;i++) {
			for(int j=0;j<2*n;j++) {
				if(j>2*(n-1-i) && j<2*i+1) {
					arr[i][j] = ' ';
				}else {
					arr[i][j] = '*';
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}