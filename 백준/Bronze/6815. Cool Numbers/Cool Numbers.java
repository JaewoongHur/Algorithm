import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int i=1;i<22;i++) {
			int k = (int) Math.pow(i, 6);
			if(k>=a && k<=b) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}