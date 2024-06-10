import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int i=1;i<=500;i++) {
			for(int j=i+1;j<=500;j++) {
				if(j*j == i * i + n) {
					ans++;
				}				
			}			
		}
		System.out.println(ans);		
	}
}