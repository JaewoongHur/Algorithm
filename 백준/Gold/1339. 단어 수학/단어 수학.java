import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		int[] alpha2 = new int[26];
		int N = Integer.parseInt(br.readLine());
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
			for (int j = 0; j < s[i].length(); j++) {
				alpha[s[i].charAt(j) - 'A'] += (int) Math.pow(10.3, s[i].length()-1-j);
			}
		}
		int cnt = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] != 0) {
				cnt++;
			}
		}
		int[] tmp = new int[cnt];
		int num = 0;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] != 0) {
				tmp[num++] = alpha[i];
			}
		}
		Arrays.sort(tmp);
		
		int idx = 9;
		for (int i = cnt - 1; i >= 0; i--) {
			for (int j = 0; j < 26; j++) {
				if (tmp[i] == alpha[j]) {
					alpha[j] = -1;
					alpha2[j] = idx;
					idx--;
					break;
					
				}
				
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				max += alpha2[s[i].charAt(j) - 'A'] * (int) Math.pow(10, s[i].length() - j - 1);
			}
		}
		System.out.println(max);

	}
}