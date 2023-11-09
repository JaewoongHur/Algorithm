import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		int n = Integer.parseInt(s[0]);
		int t = Integer.parseInt(s[1]);

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		boolean[] fire = new boolean[t + 1];

		for (int i = 0; i < n; i++) {
			for (int j = arr[i]; j <= t; j += arr[i]) {
				if (fire[j])
					continue;
				fire[j] = true;
			}
		}
		int cnt = 0;
		for(int i=1;i<=t;i++) {
			if(fire[i]) {
				cnt++;				
			}
		}
		System.out.println(cnt);
	}
}