import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] A;
	static int sum;
	static int result;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int[N];

		st = new StringTokenizer(br.readLine());
		sum = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			sum += A[i];
			if (max < A[i]) {
				max = A[i];
			}
		}
		System.out.println(binarySearch(max, sum));
	}

	public static int binarySearch(int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (findNumber(mid)) {
				end = mid - 1;
				result = mid;						
			}
			else {
				start = mid+1;				
			}
		}
		return result;
	}

	public static boolean findNumber(int target) {
		cnt = 1;
		int S = 0;
		for (int i = 0; i < N; i++) {
			S += A[i];
			if (S > target) {
				cnt++;
				S = A[i];
			}
		}
		return cnt <= M;
	}
}