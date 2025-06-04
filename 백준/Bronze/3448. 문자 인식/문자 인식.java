import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			String s;

			double total = 0;
			double sharp = 0;

			while (true) {
				s = br.readLine();

				if (s == null || s.trim().isEmpty()) {

					double ans = Math.round((total-sharp)*1000 / total);

					sb.append("Efficiency ratio is ");

					if (ans % 10 == 0) {
						sb.append((int) (ans/10));
					} else {
						sb.append(ans/10);
					}
					
					sb.append("%.\n");
					break;
				}

				total += s.length();
				
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == '#') {
						sharp++;
					}
				}
			}
		}
		System.out.println(sb);
	}
}