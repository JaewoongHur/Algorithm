import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int tc = 1;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();

			if(b.equals("E")) {
				break;
			}
			
			int c = Integer.parseInt(st.nextToken());
			
			sb.append("Case ").append(tc).append(": ");
			
			if(b.equals(">")) {
				if(a > c) {
					sb.append("true").append('\n');
				}else {
					sb.append("false").append('\n');
				}
			}else if(b.equals(">=")) {
				if(a >= c) {
					sb.append("true").append('\n');
				}else {
					sb.append("false").append('\n');
				}
			}else if(b.equals("<")) {
				if(a < c) {
					sb.append("true").append('\n');
				}else {
					sb.append("false").append('\n');
				}
			}else if(b.equals("<=")) {
				if(a <= c) {
					sb.append("true").append('\n');
				}else {
					sb.append("false").append('\n');
				}
			}else if(b.equals("==")) {
				if(a == c) {
					sb.append("true").append('\n');
				}else {
					sb.append("false").append('\n');
				}
			}else if(b.equals("!=")) {
				if(a != c) {
					sb.append("true").append('\n');
				}else {
					sb.append("false").append('\n');
				}
			}
			
			tc++;
		}
		System.out.println(sb);
	}
}