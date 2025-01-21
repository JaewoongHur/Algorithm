import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int e = 0;
		int f = 0;

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 's' || s.charAt(j) == 'S') {
					f++;
				}

				if (s.charAt(j) == 't' || s.charAt(j) == 'T') {
					e++;
				}
			}
		}
		
		if(e>f) {
			System.out.println("English");
		}else {
			System.out.println("French");
		}
	}
}