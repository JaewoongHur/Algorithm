import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] A = new int[N-1];
		for(int i=0;i<N-1;i++) {
			A[i] = Math.abs(arr[i] - arr[i+1]);
		}

		if (N == 2) {
			int d = A[0];
			int M = 2;
			while (M <= d) {
				if (d % M == 0) {
					list.add(M);
				}
				M++;
			}

		} else {
			int d = gcd(A[0], A[1]);
			for (int i = 2; i < N - 1; i++) {
				d = gcd(d, A[i]);
			}
			int M = 2;
			while (M <= d) {
				if (d % M == 0) {
					list.add(M);
				}
				M++;
			}

		}
		StringBuilder sb = new StringBuilder();
		for (int x : list) {
			sb.append(x + " ");
		}
		System.out.println(sb);
	}

	public static int gcd(int a, int b) {

		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}