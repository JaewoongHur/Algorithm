import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();
			if (s.equals("0")) {
				break;
			}

			int n = Integer.parseInt(s);

			st = new StringTokenizer(br.readLine());
			
			int total = 0;
			
			for(int i=0;i<n;i++) {
				int a = Integer.parseInt(st.nextToken());
				
				if( a + total > 300) {
					continue;
				}
				
				total += a;
			}
			
			System.out.println(total);
		}
	}
}