import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		if (N % 4 == 0) {
			int a = N / 4;
			for (int i = 0; i < a; i++) {
				sb.append("long ");
			}
			sb.append("int");
		} else {
			int a = N / 4;
			for (int i = 0; i <= a; i++) {
				sb.append("long ");
			}
			sb.append("int");
		}
		System.out.println(sb);
	}
}