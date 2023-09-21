import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()).append(' ');
			boolean pass = true;
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int s = a + b + c;
			sb.append(s).append(' ');
			if(s<55) {
				pass = false;
			}
			if(pass) {
				if(a*100<30*35) {
					pass = false;
				}
				if(b*100<30*25) {
					pass = false;
				}
				if(c*100<30*40) {
					pass = false;
				}
			}
			
			if(pass) {
				sb.append("PASS");
			}
			else {
				sb.append("FAIL");
			}
			sb.append('\n');
		}
		System.out.println(sb);		
	}
}