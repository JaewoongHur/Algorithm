import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int ans = 0;
		
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i) != s.charAt(n-1-i)) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}