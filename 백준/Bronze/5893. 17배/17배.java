import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();

		String b = a + "0000";

		a = "0000" + a;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < b.length(); i++) {
			int k = a.charAt(i) + b.charAt(i) - 2 * '0';

			sb.append(k);
		}

		String c = sb.toString();

		sb = new StringBuilder();

		int r = 0;

		for (int i = c.length() - 1; i >= 0; i--) {
			int k = c.charAt(i) - '0' + r;
			
			if(k>=2) {
				r = 1;
				sb.append(k-2);
			}else {
				r = 0;
				sb.append(k);
			}
		}
		
		if(r==1) {
			sb.append(1);
		}
		
		System.out.println(sb.reverse().toString());
	}
}