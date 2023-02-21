import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		for(int t = 1;t<=N;t++) {
			arr[t] = t;
		}
		
		for(int t =0;t<M;t++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] B = Arrays.copyOfRange(arr, k, j+1);
			for(int s=k-1;s>=i;s--) {
				arr[s+j-k+1] = arr[s];
			}
			for(int s=i;s<=i+j-k;s++) {
				arr[s] = B[s-i];				
			}
		}
		for(int x=1;x<=N;x++) {
		System.out.print(arr[x]+" ");
		}
	}
}