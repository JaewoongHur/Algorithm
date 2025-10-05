import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		String[] scale = new String[] { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };

		HashSet<Integer>[] set = new HashSet[12];

		for (int i = 0; i < 12; i++) {
			set[i] = new HashSet<>(Arrays.asList(i % 12, (i + 2) % 12, (i + 4) % 12, (i + 5) % 12, (i + 7) % 12,
					(i + 9) % 12, (i + 11) % 12));
		}

		StringBuilder sb = new StringBuilder();

		while (true) {
			s = br.readLine();
			if (s.equals("END")) {
				break;
			}

			st = new StringTokenizer(s);

			HashSet<Integer> tmp = new HashSet<>();

			int n = st.countTokens();

			for (int i = 0; i < n; i++) {
				String a = st.nextToken();

				if (a.equals("C")) {
					tmp.add(0);
				} else if (a.equals("C#")) {
					tmp.add(1);
				} else if (a.equals("D")) {
					tmp.add(2);
				} else if (a.equals("D#")) {
					tmp.add(3);
				} else if (a.equals("E")) {
					tmp.add(4);
				} else if (a.equals("F")) {
					tmp.add(5);
				} else if (a.equals("F#")) {
					tmp.add(6);
				} else if (a.equals("G")) {
					tmp.add(7);
				} else if (a.equals("G#")) {
					tmp.add(8);
				} else if (a.equals("A")) {
					tmp.add(9);
				} else if (a.equals("A#")) {
					tmp.add(10);
				} else if (a.equals("B")) {
					tmp.add(11);
				}
			}

			for (int j = 0; j < 12; j++) {
				if (set[j].containsAll(tmp)) {
					sb.append(scale[j]).append(' ');
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);

	}
}