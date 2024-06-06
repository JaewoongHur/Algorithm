import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			
			String a = st.nextToken();
			String b = st.nextToken();
			
			int m = st.countTokens();
			
			for(int j=0;j<m;j++) {
				sb.append(st.nextToken()).append(' ');
			}
			sb.append(a).append(' ').append(b).append('\n');
		}
		System.out.println(sb);
	}
}