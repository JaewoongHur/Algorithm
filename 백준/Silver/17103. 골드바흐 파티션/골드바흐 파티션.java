import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= 1000001; i++) {
			if (prime[i]) {
				continue;
			}
			for (int j = i * i; j < 1000001; j += i) {
				if (!prime[j]) {
					prime[j] = true;
				}
			}
		}
		for (int i = 0; i < T; i++) {
			int cnt = 0;
			int n = Integer.parseInt(br.readLine());
			for(int j=2;j<=n/2;j++) {
				if(prime[j]) {
					continue;
				}
				else {
					if(!prime[n-j]) {
						cnt++;
					}
				}			
			}
			sb.append(cnt).append("\n");			
		}
		System.out.println(sb);
	}
}