import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String a = br.readLine();
		String b = br.readLine();
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			if(a.charAt(i)==b.charAt(i)) {
				ans++;
			}			
		}
		System.out.println(ans);
	}
}