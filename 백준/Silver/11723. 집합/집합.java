import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	static Set<Integer> S = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		int x = 0;
		for (int i = 0; i < M; i++) {
			String[] s = br.readLine().split(" ");
			String a = s[0];

			if (s.length == 2) {
				x = Integer.parseInt(s[1]);
			}
			if (a.equals("add")) {
				add(x);
			} else if (a.equals("remove")) {
				remove(x);
			} else if (a.equals("check")) {
				sb.append(check(x)).append("\n");
			} else if (a.equals("toggle")) {
				toggle(x);
			} else if (a.equals("all")) {
				all();
			} else {
				empty();
			}
		}
		System.out.println(sb);
	}

	static void add(int x) {
		S.add(x);
	}

	static void remove(int x) {
		if (S.contains(x)) {
			S.remove(x);
		}
	}

	static int check(int x) {
		if (S.contains(x)) {
			return 1;
		} else {
			return 0;
		}
	}

	static void toggle(int x) {
		if (S.contains(x)) {
			S.remove(x);
		} else {
			S.add(x);
		}
	}

	static void all() {
		for (int i = 1; i <= 20; i++) {
			if (check(i) == 0) {
				S.add(i);
			}
		}
	}

	static void empty() {
		S.clear();
	}

}