import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int tc = 0; tc < T; tc++) {
			int n = Integer.parseInt(br.readLine());

			String s = "abcdefghijklmnopqrstuvwxyz";

			char[] arr = s.toCharArray();
			
			StringBuilder sb2 = new StringBuilder();
			
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < n; i++) {
				int idx = Integer.parseInt(st.nextToken());

				char a = arr[idx];
				
				sb2.append(a);
				
				for (int j = idx; j >= 1; j--) {
					arr[j] = arr[j-1];
				}
				arr[0] = a;
			}
			sb.append(sb2.toString()).append('\n');
		}
		System.out.println(sb);
	}
}