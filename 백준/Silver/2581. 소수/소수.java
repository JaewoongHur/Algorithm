import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		br.close();
		int[] arr = new int[N - M + 1];
		for (int i = M; i <= N; i++) {
			if (i == 1) {
				continue;
			} else if (i == 2) {
				arr[i - M] = i;
				continue;
			}
			int x = (int) Math.sqrt(i);
			while (!(i % x == 0) && x > 1) {
				x--;
			}
			if (x == 1) {
				arr[i - M] = i;
			}
		}
		Arrays.sort(arr);
		int min = arr[N-M];
		for(int i=0; i<N-M+1;i++) {
			if(arr[i] != 0) 
				min = Math.min(min , arr[i]);
		}
		
		if (arr[N - M] < 2) {
			bw.write(String.valueOf(-1));
			bw.flush();
		} else {
			bw.write(String.valueOf(Arrays.stream(arr).sum()));
			bw.newLine();
			bw.write(String.valueOf(min));
			bw.flush();
		}
		bw.close();
	}
}
