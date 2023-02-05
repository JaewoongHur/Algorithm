import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static boolean[] P = new boolean[246913];

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
		int N = 4948;
		while (N != 0) {
			N = Integer.parseInt(br.readLine());
			int cnt = 0;
			for(int i = N+1; i<=2*N;i++) {
				if(!P[i]){
					cnt++;
				}
			}
			if (N != 0) {
				bw.write(String.valueOf(cnt));
				bw.newLine();
				bw.flush();
			}
		}
		br.close();
		bw.close();
	}
}
