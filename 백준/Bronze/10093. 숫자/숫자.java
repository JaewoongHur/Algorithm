import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");

		long a = Long.parseLong(s[0]);
		long b = Long.parseLong(s[1]);

		if (a > b) {
			long tmp = b;
			b = a;
			a = tmp;
		}

		StringBuilder sb = new StringBuilder();

		if (b > a) {
			sb.append(b - a - 1).append('\n');
		} else {
			sb.append(0).append('\n');
		}

		for (long i = a + 1; i < b; i++) {
			sb.append(i).append(' ');
		}

		System.out.println(sb);

	}
}