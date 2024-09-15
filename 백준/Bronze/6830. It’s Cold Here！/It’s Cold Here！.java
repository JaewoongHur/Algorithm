import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s;
		
		int min = Integer.MAX_VALUE;
		
		String ans = "";

		while (true) {
			s = br.readLine();

			if (s == null) {
				break;
			}

			st = new StringTokenizer(s);
			
			String a = st.nextToken();
			
			int b = Integer.parseInt(st.nextToken());
			
			if(min > b) {
				min = b;
				ans = a;
			}
		}
		System.out.println(ans);
	}
}