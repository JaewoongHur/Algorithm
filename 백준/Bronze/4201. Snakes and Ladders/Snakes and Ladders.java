import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		int[] pos = new int[n + 1];
		Arrays.fill(pos, 1);

		int[] map = new int[101];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			map[s] = e;
		}

		for (int i = 1; i <= r; i++) {
			int a = i % n;

			if (a == 0) {
				a = n;
			}
			
			int d = Integer.parseInt(br.readLine());

			pos[a] += d;

			if (pos[a] >= 100) {
				pos[a] = 100;
				break;
			}

			if (map[pos[a]] != 0) {
				pos[a] = map[pos[a]];
			}
			
			if (pos[a] >= 100) {
				pos[a] = 100;
				break;
			}

		}

		for (int i = 1; i <= n; i++) {
			bw.write("Position of player " + i + " is " + pos[i] +".\n");
		}
		bw.flush();
	}
}