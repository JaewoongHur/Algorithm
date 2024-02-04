import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int cnt = 0;

		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(n-i-j==0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}