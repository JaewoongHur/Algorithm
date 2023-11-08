import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		
		if(arr[2]-arr[1] == arr[1]-arr[0]) {
			int d = arr[1]-arr[0];
			ans = arr[0] + n*d;
		}
		else {
			int r = arr[1]/arr[0];
			ans = arr[0] * (int)Math.pow(r, n);
		}
		
		System.out.println(ans);
	}
}