import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 3;
		arr[5] = 3;
		arr[6] = 3;
		arr[7] = 2;
		arr[8] = 2;
		arr[9] = 1;
		arr[10] = 1;
		
		int n = Integer.parseInt(br.readLine());

		System.out.println(arr[n]);
	}
}