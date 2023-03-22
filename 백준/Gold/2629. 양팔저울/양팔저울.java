import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] chu = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			chu[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int[] gusl = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			gusl[i] = Integer.parseInt(st.nextToken());
		}

		List<Set<Integer>> dp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			dp.add(new HashSet<>());
		}

		dp.get(0).add(chu[0]);
		for (int i = 1; i < n; i++) {
			dp.get(i).add(chu[i]);
			for (int x : dp.get(i - 1)) {
				dp.get(i).add(x);
				dp.get(i).add(x + chu[i]);
				dp.get(i).add(Math.abs(x - chu[i]));
			}
		}

		for (int i = 0; i < m; i++) {
			if (dp.get(n - 1).contains(gusl[i])) {
				sb.append("Y").append(" ");
			} else {
				sb.append("N").append(" ");
			}
		}
		System.out.println(sb);
	}
}