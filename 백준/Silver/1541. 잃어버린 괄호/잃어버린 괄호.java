import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = s.length();
		int M = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '+') {
				M++;
			}
		}
		int[] num = new int[M + 1];
		char[] op = new char[M];
		String str = "";
		int idx = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '+') {
				op[idx] = s.charAt(i);
				num[idx] = Integer.parseInt(str);
				idx++;
				str = "";
			} else {
				str += s.charAt(i);
				if (i == n - 1) {
					num[idx] = Integer.parseInt(str);
				}
			}
		}
		int minusIdx = -1;
		for (int i = 0; i < M; i++) {
			if (op[i] == '-') {
				minusIdx = i;
				break;
			}
		}
		int sum = 0;
		if (minusIdx == -1) {
			for (int i = 0; i < M + 1; i++) {
				sum += num[i];
			}
		} else {
			for(int i=0;i<=minusIdx;i++) {
				sum += num[i];
			}
			for(int i=minusIdx+1;i<M+1;i++) {
				sum -= num[i];
			}
		}
		System.out.println(sum);
	}
}