import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		double pm = Double.parseDouble(st.nextToken()) / 1000;
		int n = Integer.parseInt(st.nextToken());
		double fm = Double.parseDouble(st.nextToken()) / 1000;

		st = new StringTokenizer(br.readLine());

		double tm = 0;

		for (int i = 0; i < n; i++) {
			double a = Double.parseDouble(st.nextToken());
			tm += a / 1000;
		}

		if (fm < 1) {
			double ans = (pm + tm) * 1000 / (1 / fm - 1);

			System.out.println(ans);
		} else {
			System.out.println("Impossible");
		}
	}
}