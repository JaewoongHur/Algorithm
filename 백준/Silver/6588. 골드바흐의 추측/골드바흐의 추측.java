import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static boolean P[] = new boolean[1000001];

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

		getPrime();
		int n = 6588;
		while (n != 0) {
			n = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			for (int i = n-4; i >= 0; i--) {
				a = (n - i) / 2;
				b = (n + i) / 2;
				if (!(P[a]) && !(P[b]) && a+b == n) {
					break;
				}
			}
			if(n !=0) {
			bw.write(n + " = " + a + " + " + b);
			bw.flush();
			bw.newLine();
			}
		}
	}
}
