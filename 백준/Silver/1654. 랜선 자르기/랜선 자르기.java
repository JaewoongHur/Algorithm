import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int N, K;
	static long[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		K = Integer.parseInt(s[0]);
		N = Integer.parseInt(s[1]);
		A = new long[K];
		for(int i=0;i<K;i++) {
			A[i] = Long.parseLong(br.readLine());
		}
		Arrays.sort(A);
		System.out.println(binarySearch()-1);

	}
	static long binarySearch() {
		long left = 1;
		long right = A[K-1]+1;
		long mid = 0;
		while(left<right) {
			mid = (right+left)/2;
			long seg =0;
			for(int i=0;i<K;i++) {
				seg+= A[i]/mid;
			}
			if(seg>=N) {
				left = mid+1; 
			}
			else {
				right = mid;
			}	
		}
		return right;
	}
}