import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s;
		while(true) {
			s = br.readLine();
			if(s.equals("0 W 0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			int c = Integer.parseInt(st.nextToken());
				
			if(b.equals("W")) {
				int t = a - c;
				if(t>=-200) {
				sb.append(t).append('\n');
				}else {
					sb.append("Not allowed").append('\n');
				}
			}
			else {
				int t = a + c;
				sb.append(t).append('\n');
			}
		}
		System.out.println(sb);
	}
}