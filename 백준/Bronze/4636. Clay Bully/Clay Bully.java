import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (true) {
			s = br.readLine();

			if (s.equals("-1")) {
				break;
			}

			int n = Integer.parseInt(s);

			int[] arr = new int[n];
			String[] stud = new String[n];

			int min = Integer.MAX_VALUE;
			int max = 0;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());

				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				String d = st.nextToken();

				stud[i] = d;

				int k = a * b * c;
				
				arr[i] = k;
				
				if (min > k) {
					min = k;
				}

				if (max < k) {
					max = k;
				}
			}
			String a = ""; String b = "";
			
			for(int i=0;i<n;i++) {
				if(min == arr[i]) {
					b = stud[i];
				}			
				if(max == arr[i]) {
					a = stud[i];
				}
			}
			System.out.println(a + " took clay from " + b + ".");			
		}

	}
}