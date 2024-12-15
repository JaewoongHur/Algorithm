import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int m = st.countTokens();
			int s = 0;
			for (int j = 0; j < m; j++) {
				s += Integer.parseInt(st.nextToken());
			}
			System.out.println(s);
		}
	}
}