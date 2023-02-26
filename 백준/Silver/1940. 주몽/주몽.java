import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int cnt = 0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(A[i] + A[j] == M) {
					cnt++;
					break;
				}
				
			}
		}
		System.out.println(cnt);		
	}
}