import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] A;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			A = new int[N];
			for (int j = 1; j <= Q; j++) {
				st = new StringTokenizer(br.readLine());
				int L = Integer.parseInt(st.nextToken()) - 1;
				int R = Integer.parseInt(st.nextToken()) - 1;
				for (int k = L; k <= R; k++) {
					A[k] = j;
				}
			}
			bw.write("#"+i);
			for (int x : A) {
				bw.write(" "+x);
			}
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}