import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			arr[a] = i;			
		}
		
		for(int i=1;i<=n;i++) {
			System.out.println(arr[i]);
		}
	}
}