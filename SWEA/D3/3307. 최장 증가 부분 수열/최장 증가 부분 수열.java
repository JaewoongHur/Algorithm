import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int[] L = new int[N];

			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
			}

			for (int j = 0; j < N; j++) {
				L[j] = 1;
				for (int k = 0; k < j; k++) {
					if (arr[k] <= arr[j]) {
						L[j] = Math.max(L[k] + 1, L[j]);
					}
				}
			}
			Arrays.sort(L);			
			System.out.println("#" + i + " " + L[N - 1]);
	
		}
		sc.close();
	}
}