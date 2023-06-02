import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();

		boolean zero = false;

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				zero = true;
			}
			sum += s.charAt(i) - '0';
		}

		boolean three = false;

		if (sum % 3 == 0)
			three = true;
		
		if(!zero||!three) {
			System.out.println(-1);
		}
		else {
			Integer[] arr = new Integer[s.length()];
			
			for(int i=0;i<s.length();i++) {
				arr[i] = s.charAt(i)-'0';
			}
			
			Arrays.sort(arr,Collections.reverseOrder());
			for(int i=0;i<s.length();i++) {
				sb.append(arr[i]);
			}
			System.out.println(sb);
		}

	}
}