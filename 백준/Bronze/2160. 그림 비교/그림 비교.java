import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		char[][][] arr = new char[n][5][7];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				String s = br.readLine();
				for(int k=0;k<7;k++) {
					arr[i][j][k] = s.charAt(k);					
				}				
			}			
		}
		
		int min = Integer.MAX_VALUE;
		int x = 0; int y = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int cnt = 0;
				for(int a=0;a<5;a++) {
					for(int b=0;b<7;b++) {
						if(arr[i][a][b] != arr[j][a][b]) {
							cnt++;
						}					
					}
				}
				if(cnt<min) {
					min = cnt;
					x = i+1; y = j+1;
				}
			}
		}
		System.out.println(x + " " + y);
	}
}