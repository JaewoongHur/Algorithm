import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int ans = 0;
		
		for (int i = 0; i < s; i++) {
			int a = Integer.parseInt(st.nextToken());

			if (k > a) {
				ans += a;
			}else {
				ans += k-1;
			}
		}
		System.out.println(ans+1);
	}
}