import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();

		int n = s.length();

		if (n % 3 == 1) {
			s = "00" + s;
		} else if (n % 3 == 2) {
			s = '0' + s;
		}
		
		n = s.length();
	
		int m = n/3;
		int[] arr = new int[m];
		int idx = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0)
				sum += 4 * (s.charAt(i) - '0');
			else if (i % 3 == 1) {
				sum += 2 * (s.charAt(i) - '0');
			} else {
				sum += s.charAt(i) - '0';
				arr[idx] += sum;
				idx++;
				sum = 0;
			}
		}

		for(int i=0;i<m;i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);

	}
}