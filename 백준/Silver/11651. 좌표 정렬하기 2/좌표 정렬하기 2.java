import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] A = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				if (a1[1] == a2[1]) {
					return a1[0] - a2[0];
				} else {
					return a1[1] - a2[1];
				}
			}
		});

		for (int[] x : A) {
			bw.write(x[0] + " " + x[1]);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}