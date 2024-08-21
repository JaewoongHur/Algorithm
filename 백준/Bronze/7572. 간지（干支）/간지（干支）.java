import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[60];
		
		String[] a = new String[] {"0","1","2","3","4","5","6","7","8","9"};
		String[] b = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L"};
		
		for(int i=0;i<60;i++) {
			arr[(i+4)%60] = b[i%12] + a[i%10];
		}
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(arr[n%60]);
	}
}