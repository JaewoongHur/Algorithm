import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		String[] mbti = new String[] { "INFP", "INFJ", "INTP", "INTJ", "ISFP", "ISFJ", "ISTP", "ISTJ", "ENFP", "ENFJ",
				"ENTP", "ENTJ", "ESFP", "ESFJ", "ESTP", "ESTJ" };

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[16];
			st = new StringTokenizer(br.readLine());
			String s;
			for (int i = 0; i < n; i++) {
				s = st.nextToken();
				for (int j = 0; j < 16; j++) {
					if (s.equals(mbti[j])) {
						arr[j]++;
					}
				}
			}
			int res = Integer.MAX_VALUE;
			for (int i = 0; i < 16; i++) {
				if (arr[i] >= 3) {
					res = 0;
					break;
				} else if (arr[i] == 2) {
					String a = mbti[i];
					for (int j = 0; j < 16; j++) {
						if (i == j) {
							continue;
						}
						if (arr[j] >= 1) {
							int cnt = 0;
							String b = mbti[j];
							for (int d = 0; d < 4; d++) {
								if (a.charAt(d) == b.charAt(d)) {
									continue;
								}
								cnt++;
							}
							res = Math.min(res, 2*cnt);
						}
					}
				} else if (arr[i] == 1) {
					for (int j = 0; j < 16; j++) {
						if (arr[j] >= 2) {
							continue;
						}
					}
					String a = mbti[i];
					for (int j = i + 1; j < 16; j++) {
						if (arr[j] == 0)
							continue;
						String b = mbti[j];
						for (int k = j + 1; k < 16; k++) {
							if (arr[k] == 0)
								continue;
							int cnt = 0;
							String c = mbti[k];
							for (int d = 0; d < 4; d++) {
								if (a.charAt(d) == b.charAt(d)) {
									continue;
								}
								cnt++;
							}
							for (int d = 0; d < 4; d++) {
								if (b.charAt(d) == c.charAt(d)) {
									continue;
								}
								cnt++;
							}
							for (int d = 0; d < 4; d++) {
								if (c.charAt(d) == a.charAt(d)) {
									continue;
								}
								cnt++;
							}
							res = Math.min(res, cnt);
						}

					}
				}

				else {
					continue;
				}
			}
			System.out.println(res);
		}
	}
}