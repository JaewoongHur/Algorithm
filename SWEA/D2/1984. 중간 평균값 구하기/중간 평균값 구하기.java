import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int[] arr = new int[10];
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<10;j++) {
				arr[j] = Integer.parseInt(st.nextToken());			
			}
		Arrays.sort(arr);
		bw.write("#"+i+" "+ (Math.round((double)(Arrays.stream(arr).sum() - arr[0] - arr[9])/8)));
		bw.newLine();
		bw.flush();
		}
		br.close();
		bw.close();
	}
}