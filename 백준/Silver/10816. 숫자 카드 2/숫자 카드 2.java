import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int mapKey = Integer.parseInt(st.nextToken());
			if (map.get(mapKey) == null) {
				map.put(mapKey, 1);
			} else {
				map.replace(mapKey, map.get(mapKey) + 1);
			}
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int mapKey = Integer.parseInt(st.nextToken());
			if (map.get(mapKey) != null) {
				sb.append(map.get(mapKey) + " ");
			}
			else {
				sb.append(0+" ");
			}

		}
		System.out.println(sb);
	}
}