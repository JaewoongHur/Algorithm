import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			List<Integer> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int a = Integer.parseInt(st.nextToken());
				list.add(a);
			}

			int cmd = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int t = 0; t < cmd; t++) {
				String str = st.nextToken();

				if (str.equals("I")) {

					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					for (int i = 0; i < y; i++) {
						int s = Integer.parseInt(st.nextToken());
						list.add(x, s);
						x++;
					}
				}

				else if (str.equals("D")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());

					for (int i = 0; i < y; i++) {
						list.remove(x + 1);
					}
				} else if (str.equals("A")) {
					int y = Integer.parseInt(st.nextToken());
					for (int i = 0; i < y; i++) {
						int s = Integer.parseInt(st.nextToken());
						list.add(s);
					}
				}
			}

			sb.append("#").append(tc);
			for (int i = 0; i < 10; i++) {
				sb.append(' ').append(list.get(i));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}