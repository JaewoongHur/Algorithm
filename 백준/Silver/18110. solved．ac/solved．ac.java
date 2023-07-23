import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		if (n == 0) {
			System.out.println(0);
		} else {
			int[] op = new int[n];
			for (int i = 0; i < n; i++) {
				op[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(op);
			int p = n * 15;
			p = (int) Math.round(p / 100.0);

			double sum = 0;

			for (int i = p; i < n - p; i++) {
				sum += op[i];
			}
			double avg = sum/(n-2*p);
			int ans = (int)Math.round(avg);
			System.out.println(ans);
		}
	}
}