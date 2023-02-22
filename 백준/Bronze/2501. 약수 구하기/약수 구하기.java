import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int a = 1;
		while (cnt != K && N>=a) {
			if (N % a == 0) {
				cnt++;
			}
			a++;
		}
		
		if (cnt < K) {
			System.out.println(0);
		} else {
			System.out.println(a-1);
		}
	}
}