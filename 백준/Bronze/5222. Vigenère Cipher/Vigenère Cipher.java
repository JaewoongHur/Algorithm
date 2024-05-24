import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			String ans = "";
			
			String a = st.nextToken();
			String b = st.nextToken();
			
			int n = a.length();
			int m = b.length();
			
			StringBuilder s = new StringBuilder();
			
			for(int i=0;i<m;i++) {
				s.append(a.charAt(i%n));
			}
			
			String c = s.toString();
			
			s = new StringBuilder();
			
			for(int i=0;i<m;i++) {
				int k = c.charAt(i)-'A';
				int l = b.charAt(i)-'A';
				
				k = (k + l) % 26;
				
				s.append((char) (k + 'A'));
			}
			
			ans = s.toString();
			
			sb.append("Ciphertext: ").append(ans).append('\n');
		}
		System.out.println(sb);
	}
}