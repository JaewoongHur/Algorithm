import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine().trim());

		int[] arr = new int[] {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		for (int tc = 1; tc <= n; tc++) {
			String a = br.readLine().trim();

			int k = 0;

			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == '-')
					continue;

				if (k == 10)
					break;

				if (k == 3 || k == 6) {
					sb.append('-');
				}

				if (Character.isDigit(a.charAt(i))) {
					sb.append(a.charAt(i));
				} else {
					sb.append(arr[a.charAt(i)-'A']);					
				}
				k++;
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}