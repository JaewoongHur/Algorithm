import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		double D = A * B * C;
		String s = String.valueOf((int) D);
		int N = (int) Math.log10(D) + 1;
		int[] arr = new int[10];
		for (int i = 0; i < N; i++) {
			arr[s.charAt(i) - '0']++;
		}
		for (int x : arr) {
			bw.write(String.valueOf(x));
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}