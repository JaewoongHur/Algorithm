import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine().trim());

		st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());

		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			String a = st.nextToken();

			if (a.charAt(0) == '+') {
				s += Integer.parseInt(a.substring(1,a.length()));
			} else if (a.charAt(0) == '-') {
				s -= Integer.parseInt(a.substring(1,a.length()));
			} 
			
			if(s>h[i]) {
				sb.append('V');
			}else if(s<h[i]) {
				sb.append('T');
			}else {
				sb.append('M');
			}
		}
		
		System.out.println(sb);
	}
}