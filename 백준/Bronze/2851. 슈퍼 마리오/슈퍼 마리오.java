import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int x = 0;
		
		int min = Integer.MAX_VALUE;
		
		int s = 0;
		
		for(int i=0;i<10;i++) {
			 s += arr[i];
			 
			 int a = Math.abs(100 - s);
			 
			 if(min>=a) {
				 x = s;
				 min = a;
			 }
		}
		System.out.println(x);
	}
}