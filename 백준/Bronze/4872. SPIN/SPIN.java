import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;

		s = br.readLine();

		int n = s.length();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.charAt(i) - '0';
		}
		
		while (true) {
			s = br.readLine();

			if (s == null || s.isEmpty()) {
				break;
			}

			for (int i = 0; i < n; i++) {
				arr[i] = (arr[i] + s.charAt(i) - '0') % 10;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}