import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long[] A = new long[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		long left = 0;
		long right = Long.MAX_VALUE;
		long mid = 0;
		long S = 0;
		while (left < right) {
			mid = (left + right) / 2;
			S=0;
			for (int i = 0; i < N; i++) {
				if (A[i] > mid) {
					S += A[i] - mid;
				}
			}
			if (S > M) {
				left = mid + 1;
			} else if (S < M) {
				right = mid;
			}
			else {
				break;
			}
		}
		S=0;
		for(int i=0;i<N;i++) {
			if (A[i] > mid) {
			S+= A[i]-mid;
			}
		}
		if(S>=M) {
			System.out.println(mid);
		}
		else {
			System.out.println(mid-1);
		}
	}
}