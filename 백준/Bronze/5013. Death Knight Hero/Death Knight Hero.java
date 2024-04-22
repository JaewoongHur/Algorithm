import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine().trim());
		
		int ans = 0;
		
		out: for (int i = 0; i < n; i++) {
			String s = br.readLine();
			
			int m = s.length();
			
			for(int j=0;j<m-1;j++) {
				if(s.charAt(j)=='C' && s.charAt(j+1)=='D') {
					continue out;
				}
			}
			ans++;
		}
		System.out.println(ans);
	}
}