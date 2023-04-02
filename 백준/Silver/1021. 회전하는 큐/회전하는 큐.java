import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> q = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M];

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int idx = 0;
		int sum = 0;
		int cnt = 0;
		while (idx < M) {
			int s = q.size();
			int a = 0;
			for (int i = 0; i < s; i++) {
				a = q.poll();
				if (a == arr[idx]) {
					if (cnt > s / 2) {
						sum += s-cnt;
						cnt = 0;
						break;
					} else {
						sum += cnt;
						cnt = 0;
						break;
					}
					
				} else {
					q.add(a);
					cnt++;
				}
			}
			idx++;
		}
		System.out.println(sum);
	}
}