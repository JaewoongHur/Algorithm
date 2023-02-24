import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> A = new HashSet<>();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(st.nextToken());
			A.add(a);
		}

		int cnt = 0;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (A.contains(a)) {
				cnt++;
			}
		}

		System.out.println(N + M - 2 * cnt);

	}
}