import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());	
		int[] S = new int[n];	
		st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int min = max;
		int sum = max;
		S[0] = max;
		for(int i = 1;i<n;i++) {
			sum += Integer.parseInt(st.nextToken());
			S[i] = sum;
			if(min>S[i-1]) {
				min = S[i-1];
			}
			if(max<S[i]-min) {
				max = S[i] - min;
			}	
			if(max<S[i]) {
				max = S[i];
			}
		}
		System.out.println(max);	
	}
}