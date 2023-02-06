import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] arr; int[] L;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			L = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0;j<N;j++) {
					L[j] = 1;
				for(int k=0; k<j;k++) {
					if(arr[k]<=arr[j]) {
						L[j] = Math.max(L[k]+1, L[j]);
					}
				}
			}
            Arrays.sort(L);
			bw.write("#"+i+" "+L[N-1]);
			bw.flush();
			bw.newLine();
		}	
	}
}