import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long N;
	static long K;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N= Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		System.out.println(binarySearch(1, K));
	}
	
	public static long binarySearch(long start, long end) {
	
		while(start<end) {
			long mid = (start + end)/2;
			long S = 0;
			
			for(int i = 1;i<=N;i++) {
				S += Math.min(mid/i, N); 
			}
			if(S<K) {
				start = mid+1;
			}
			else {
				end = mid;
			}
		}
		return start;
	}
	
}