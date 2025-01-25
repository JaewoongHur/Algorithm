import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=n;tc++) {
			String[] s = br.readLine().split(" ");
			
			long a = Long.parseLong(s[0]);
			long b = Long.parseLong(s[1]);
			
			
			
			long ans = (b-a+1)*(a+b)/2;
			
			sb.append("Scenario #").append(tc).append(":\n");
			sb.append(ans).append('\n').append('\n');
		}
		
		System.out.println(sb);
	}
}