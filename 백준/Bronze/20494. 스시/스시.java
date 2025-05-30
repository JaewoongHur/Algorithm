import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			ans += s.length();
		}
		
		System.out.println(ans);
	}
}