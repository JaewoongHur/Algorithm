import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		sum -= arr[0] + arr[n-1];
		
		
		System.out.println(sum);
	}
}