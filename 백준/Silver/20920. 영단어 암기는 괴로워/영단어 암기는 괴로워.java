import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			if (word.length() < M) {
				continue;
			}
			if (map.get(word) == null) {
				map.put(word, 1);
			} else {
				map.put(word, map.get(word) + 1);
			}
		}

		String[] arr = new String[map.size()];
		int idx = 0;
		for (String x : map.keySet()) {
			arr[idx] = x;
			idx++;
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (map.get(s1) < map.get(s2)) {
					return 1;
				} else if (map.get(s1) == map.get(s2)) {
					if (s1.length() < s2.length()) {
						return 1;
					} else if (s1.length() == s2.length()) {
						return s1.compareTo(s2);
					}
					return -1;
				}
				return -1;
			}
		});

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}
}