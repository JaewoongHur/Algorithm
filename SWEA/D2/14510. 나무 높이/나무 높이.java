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
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			int[] B = new int[N];
			Arrays.sort(A);
			int max = A[N - 1];
			for (int i = 0; i < N; i++) {
				B[i] = max - A[i];
			}
			int countOne = 0;
			int countTwo = 0;
			for (int i = 0; i < N; i++) {
				countTwo += B[i]/2;
				if(B[i] % 2 == 1) {
				countOne ++;
				}
			}
			int result = 0;
			if(countOne == countTwo) {
				result = 2*countOne;
			}
			else if(countOne<countTwo) {
				result = (4*countTwo+2*countOne+2)/3;
			}
			else {
				result = 2*countOne-1; 
			}
			sb.append("#").append(tc).append(' ').append(result);
			sb.append("\n");
		}
		System.out.println(sb);
	}
}