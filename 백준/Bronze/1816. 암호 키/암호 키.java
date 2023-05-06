import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		boolean[] prime = new boolean[1000001];

		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i * i < 1000001; i++) {
			if (prime[i]) {
				continue;
			}
			for (int j = 2 * i; j < 1000001; j += i) {
				prime[j] = true;
			}
		}
		for(int tc =1 ;tc<=N;tc++) {
			long a = Long.parseLong(br.readLine());
				boolean check = false;
			for(int i=0;i<1000001;i++) {
				if(!prime[i] && a % i == 0) {
					check = true;
				}
			}
			if(check) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		
		
	}
}