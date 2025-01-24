import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		char prev = s.charAt(0);

		int h = 10;

		int c = 0;

		for (int i = 1; i < s.length(); i++) {
			if (prev != s.charAt(i)) {
				h += 5;
			}

			h += 5;
			prev = s.charAt(i);
		}
		
		System.out.println(h);
	}
}