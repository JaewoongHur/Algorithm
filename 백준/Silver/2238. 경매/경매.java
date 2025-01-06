import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int u = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[] cnt = new int[10001];

		HashMap<Integer, String> map = new HashMap<>();

		// 한 Integer에 여러 명일 경우 가장 먼저 제시한 사람이기 때문에 갱신을 하지 않아도 됨.

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			if (!map.containsKey(a)) {
				map.put(a, s);
			}
			cnt[a]++;
		}
		
		int min = Integer.MAX_VALUE;
		int minValue = 0;
		
		for (int i = 0; i < 10001; i++) {
			if(cnt[i]==0) continue;
			
			if(min > cnt[i]) {
				min = cnt[i];
				minValue = i;
			}
		}
		
		System.out.println(map.get(minValue) + " " + minValue);

	}
}