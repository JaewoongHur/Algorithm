import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		int sum = 0;
		
		while (true) {
			s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			if (s.equals("0")) {
				System.out.println(sum);
				sum = 0;
				continue;
			}
			st = new StringTokenizer(s);
			st.nextToken();
			st.nextToken();

			int a = Integer.parseInt(st.nextToken());

			String c = st.nextToken();

			if (c.equals("F")) {
				sum += 2 * a;
			} else if (c.equals("B")) {
				if (a % 2 == 0) {
					sum += a + a / 2;
				} else {
					sum += a + a / 2 + 1;
				}
			} else if (c.equals("Y")) {
				if (a >= 500) {
					sum += a;
				} else {
					sum += 500;
				}
			}
		}
	}
}
