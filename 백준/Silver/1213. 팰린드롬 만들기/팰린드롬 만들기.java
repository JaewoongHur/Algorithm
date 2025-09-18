import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[26];

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i) - 'A';
			num[a]++;
		}

		int odd = 0;

		for (int i = 0; i < 26; i++) {
			if (num[i] % 2 == 1) {
				odd++;
			}
		}

		StringBuilder sb = new StringBuilder();

		if (odd >= 2) {
			System.out.println("I'm Sorry Hansoo");
		} else if (odd == 1) {
			int n = 0;
			for (int i = 0; i < 26; i++) {
				if (num[i] % 2 == 1) {
					n = i;
					int m = num[i] / 2;
					for (int j = 0; j < m; j++) {
						sb.append((char) (i + 'A'));
					}
				} else {
					int m = num[i] / 2;
					for (int j = 0; j < m; j++) {
						sb.append((char) (i + 'A'));
					}
				}
			}

			StringBuilder sb2 = new StringBuilder();
			StringBuilder sb3 = new StringBuilder();
			sb2 = sb;
			sb3.append(sb).append((char) (n + 'A')).append(sb2.reverse());
			System.out.println(sb3);
			
		} else {
			for(int i=0;i<26;i++) {
				int m = num[i]/2;
				
				for(int j=0;j<m;j++) {
					sb.append((char)(i+'A'));
				}
			}
			StringBuilder sb2 = new StringBuilder();
			StringBuilder sb3 = new StringBuilder();
			sb2 = sb;
			sb3.append(sb).append(sb2.reverse());
			System.out.println(sb3);
		}
	}
}