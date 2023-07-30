import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		long[] arr = new long[54];
		arr[0] = 1;
		for(int i=1;i<54;i++) {
			arr[i] = 2 * arr[i-1] + (1L<<i);
		}
		
		A-=1;
		long a = A & 1; long b= B & 1;
		
		for(int i=54;i>0;i--) {
			if((A&(1L<<i)) > 0L) {
				a += arr[i-1] + (A-(1L<<i)+1);
				A -= (1L<<i);
			}
		}
		
		for(int i=54;i>0;i--) {
			if((B&(1L<<i)) > 0L) {
				b += arr[i-1] + (B-(1L<<i)+1);
				B -= (1L<<i);
			}
		}
		
		System.out.println(b-a);
	}
}