import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int sum = 0;
		

		for (int i = 0; i < s.length(); i += 2) {
			int a = s.charAt(i) - '0';

			char b = s.charAt(i + 1);

			int k = a * getValue(b);
			
			if(i+3<s.length()) {
				char d = s.charAt(i+3);
				if(getValue(b) < getValue(d)) {
					k = - k;
				}
			}
			sum += k;
		}
		System.out.println(sum);
	}

	static int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}