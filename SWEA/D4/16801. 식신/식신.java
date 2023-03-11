import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long K = Long.parseLong(st.nextToken());
            int[] A = new int[N];
            int[] F = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                F[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(A);
            Arrays.sort(F);
            reverse(F);
            long left = 0;
            long right = 0;
            for (int i = 0; i < N; i++) {
                right = Math.max(right, (long) A[i] * F[i]);
            }

            while (left < right) {
                long mid = (left + right) / 2;
                long cnt = 0;
                for (int i = 0; i < N; i++) {
                    if (mid < (long) A[i] * F[i]) {
                        cnt += A[i] - mid / F[i];
                    }
                }
                if (cnt <= K) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            sb.append("#").append(tc).append(" ").append(left).append("\n");
        }
      System.out.println(sb);
	}

	public static void reverse(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}