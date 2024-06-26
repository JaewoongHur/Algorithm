import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int s = 0;
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			s += arr[i];
		}
		
		int avg = s/n;
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			if(avg > arr[i]) {
				ans += avg - arr[i];
			}
		}
		System.out.println(ans);
	}
}