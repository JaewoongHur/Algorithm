import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine().trim());

		int x = Integer.parseInt(br.readLine().trim());

		int total = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int p1 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());

			if (Math.abs(p1 - p2) <= x) {
				total += Math.max(p1, p2);
			}else {
				int p3 = Integer.parseInt(br.readLine().trim());
				total += p3;
			}
		}
		System.out.println(total);
	}
}
