import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			int M = Integer.parseInt(br.readLine());
			
			sb.append(M/25+" ");
			M=M-25*(M/25);
			sb.append(M/10+" ");
			M=M-10*(M/10);
			sb.append(M/5+" ");
			M=M-5*(M/5);
			sb.append(M);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}