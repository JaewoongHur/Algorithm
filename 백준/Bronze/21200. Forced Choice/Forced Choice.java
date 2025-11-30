import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		for (int i = 0; i < s; i++) {
			st = new StringTokenizer(br.readLine());

			int m = Integer.parseInt(st.nextToken());

			boolean pass = false;

			for (int j = 0; j < m; j++) {
				int a = Integer.parseInt(st.nextToken());
				if (a == p) {
					pass = true;
					break;
				}
			}
			
			if(pass) {
				System.out.println("KEEP");
			}else {
				System.out.println("REMOVE");
			}

		}

	}
}
