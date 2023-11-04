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
		
		
		int max = arr[0];
		int cnt = 1;
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
				cnt++;
			}			
		}
		System.out.println(cnt);
		max = arr[n-1];
		cnt = 1;
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>max) {
				max = arr[i];
				cnt++;
			}		
		}

		System.out.println(cnt);
	
	}
}