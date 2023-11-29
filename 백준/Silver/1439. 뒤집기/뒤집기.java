import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int a0 = 0;
		int a1 = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
				a0++;
			} else if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
				a1++;
			}
		}
		if(s.charAt(s.length()-1)=='0') {
			a0++;
		}
		else {
			a1++;
		}
		
		System.out.println(Math.min(a0, a1));
	}
}