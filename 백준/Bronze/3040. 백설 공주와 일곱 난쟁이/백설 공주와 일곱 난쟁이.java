import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
			
		int k = sum - 100;
		
		int a = 0; int b = 0;
		
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if(arr[i]+arr[j] == k) {
					a = arr[i];
					b = arr[j];
					break;
				}
			}
		}
		
		for(int i=0;i<9;i++) {
			if(arr[i] == a || arr[i] == b) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
	}
}