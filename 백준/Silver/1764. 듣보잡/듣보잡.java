import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<String> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			set.add(s);
		}
		int cnt = 0;
		List<String> list = new ArrayList<String>();
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (set.contains(s)) {
				cnt++;
				list.add(s);
			}
		}
		Collections.sort(list);
		for(String s : list) {
			sb.append(s + "\n");
		}
		System.out.println(cnt);
		System.out.println(sb);
	}
}