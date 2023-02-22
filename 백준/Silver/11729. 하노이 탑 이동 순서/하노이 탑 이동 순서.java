import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		sb.append((int)Math.pow(2, N)-1).append("\n");
		hanoi(1, 2, 3, N);
		System.out.println(sb);
	}

	public static void hanoi(int start, int mid, int end, int N) {

		if (N == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		hanoi(start, end, mid, N - 1);
		sb.append(start + " " + end + "\n");
		hanoi(mid, start, end, N - 1);
	}
}