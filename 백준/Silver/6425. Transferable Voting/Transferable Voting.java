import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		int tc = 0;

		while (true) {
			s = br.readLine().trim();
			if (s.isEmpty()) continue;
			if (s.equals("0 0")) {
				break;
			}

			tc++;

			st = new StringTokenizer(s);

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			List<Queue<Integer>> list = new ArrayList<>();

			int invalid = 0;

			for (int i = 0; i < m; i++) {
				String t = br.readLine().trim();
				if(t.isEmpty()) continue;
				st = new StringTokenizer(t);
				boolean[] check = new boolean[n + 1];
				int[] tmp = new int[n];
				boolean pass = true;

				for (int j = 0; j < n; j++) {
					tmp[j] = Integer.parseInt(st.nextToken());

					if (tmp[j] > n || tmp[j] <= 0) {
						pass = false;
					} else if (check[tmp[j]]) {
						pass = false;
					} else {
						check[tmp[j]] = true;
					}
				}

				if (pass) {
					Queue<Integer> q = new LinkedList<>();
					for (int j = 0; j < n; j++) {
						q.add(tmp[j]);
					}
					list.add(q);
				} else {
					invalid++;
				}
			}

			int v = m - invalid;

			boolean[] leave = new boolean[n + 1];
			int save = n;

			out: while (true) {
				int[] voted = new int[n + 1];
				for (int i = 0; i < list.size(); i++) {
					voted[list.get(i).peek()]++;
				}

				if (save == 1) {
					int idx = 0;
					for (int i = 1; i <= n; i++) {
						if (!leave[i]) {
							idx = i;
						}
					}
					System.out.println("Election #" + tc);
					if (invalid > 0) {
						System.out.println("   " + invalid + " bad ballot(s)");
					}
					System.out.println("   Candidate " + idx + " is elected.");
					break out;
				}

				for (int i = 1; i <= n; i++) {
					if (voted[i] > v / 2) {
						System.out.println("Election #" + tc);
						if (invalid > 0) {
							System.out.println("   " + invalid + " bad ballot(s)");
						}
						System.out.println("   Candidate " + i + " is elected.");
						break out;
					}
				}

				boolean tieCheck = true;
				int tie = 0;
				for (int i = 1; i <= n; i++) {
					if (leave[i])
						continue;
					if (tie == 0) {
						tie = voted[i];
					} else {
						if (tie != voted[i]) {
							tieCheck = false;
						}
					}
				}

				if (tieCheck) {
					System.out.println("Election #" + tc);
					if (invalid > 0) {
						System.out.println("   " + invalid + " bad ballot(s)");
					}
					System.out.print("   The following candidates are tied:");
					for (int i = 1; i <= n; i++) {
						if (!leave[i] && tie == voted[i]) {
							System.out.print(" " + i);
						}
					}
					System.out.println();
					break out;
				}

				int min = Integer.MAX_VALUE;
				int idx = 0;
				for (int i = 1; i <= n; i++) {
					if (leave[i])
						continue;
					if (min > voted[i]) {
						min = voted[i];
						idx = i;
					}
				}

				leave[idx] = true;
				save--;

				int l = list.size();
				for (int i = 0; i < l; i++) {
					while (!list.get(i).isEmpty() && leave[list.get(i).peek()]) {
						list.get(i).poll();
					}
					if (list.get(i).isEmpty()) {
						list.remove(i);
						v--;
						i--;
						l--;
					}
				}
			}
		}
	}
}
