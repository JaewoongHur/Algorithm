import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[] X = new int[n + 1];
		int[] Y = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			X[i] = a;
			Y[i] = b;
		}

		double max = 0;

		int m1 = 0;
		int m2 = 0;
		
		for (int i = 1; i <= n - 1; i++) {
			for (int j = i + 1; j <= n; j++) {
				double d = Math.sqrt((X[i]-X[j])*(X[i]-X[j]) + (Y[i]-Y[j])*(Y[i]-Y[j]));
				
				if(max < d) {
					m1 = i; m2 = j;
					max = d;
				}
			}
		}
		
		System.out.println(m1 + " " + m2);
		
	}
}