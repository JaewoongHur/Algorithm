import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static boolean P[] = new boolean[10001];

	public static void getPrime() {
		P[0] = P[1] = true;
		for (int i = 2; i <= Math.sqrt(P.length); i++) {
			if (P[i])
				continue;
			for (int j = i * i; j < P.length; j += i) {
				P[j] = true;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		getPrime();
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			for (int j = 0; j < n - 1; j++) {
				a = (n + j) / 2;
				b = (n - j) / 2;
				if (!(P[a]) && !(P[b])) {
					break;
				}
			}
			bw.write(Math.min(a, b) + " " + Math.max(a, b));
			bw.flush();
			bw.newLine();
		}
	}
}
