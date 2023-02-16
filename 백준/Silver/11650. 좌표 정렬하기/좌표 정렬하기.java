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
			public int compare(int[] e1,int[]e2) {
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0];
				}
			}
		});
		for (int i = 0; i < N; i++) {
			bw.write(A[i][0] + " " + A[i][1]);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}