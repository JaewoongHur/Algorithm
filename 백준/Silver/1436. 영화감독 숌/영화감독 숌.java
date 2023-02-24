import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int apocalypse = 666;
		int result = 0;
		while (cnt < N) {
			int countSix = 0;
			int tmp = apocalypse;
			while (tmp > 0) {
				if (tmp % 1000 == 666) {
					countSix++;
				}
				tmp = tmp /10;
			}
			if(countSix >0) {
				cnt++;
				result = apocalypse;
			}
			apocalypse++;
		}
		System.out.println(result);
	}
}