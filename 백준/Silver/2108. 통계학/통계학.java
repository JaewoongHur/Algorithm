import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[8002];
		int[] ch = new int[8002];
		double sum = 0;
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			sum += a;
			cnt[a + 4001]++;
			ch[a + 4001]++;
		}
		bw.write((int) (Math.round(sum / N)) + "\n");
		sum = 0;
		for (int i = 0; i < 8002; i++) {
			sum += cnt[i];
			if (sum >= (N + 1) / 2) {
				bw.write(i - 4001 + "\n");
				break;
			}
		}
		Arrays.sort(ch);
		int max = ch[8001];
		int b = 0;
		int f = 0;
		for (int i = 0; i < 8002; i++) {
			if (max == cnt[i]) {
				b++;
				if (b == 1) {
					f = i - 4001;
				} else if (b == 2) {
					bw.write(i - 4001 + "\n");
					break;
				}
			}
		}
		if (b < 2) {
			bw.write(f + "\n");
		}

		int c = 0;
		int d = 0;
		for (int i = 0; i < 8002; i++) {
			if (cnt[i] != 0) {
				c = i - 4001;
				break;
			}
		}
		for (int i = 8001; i >= 0; i--) {
			if (cnt[i] != 0) {
				d = i - 4001;
				break;
			}
		}
		bw.write(String.valueOf(d - c));
		bw.flush();
		br.close();
		bw.close();
	}
}