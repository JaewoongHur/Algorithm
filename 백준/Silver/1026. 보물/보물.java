import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Integer [] A = new Integer[N];
		int[] B = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());		
		}
		
		Arrays.sort(A, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}		
		});
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(B);
		
		int sum =0;
		for(int i=0;i<N;i++) {
			sum += A[i] * B[i];			
		}
		
		System.out.println(sum);
	}
}