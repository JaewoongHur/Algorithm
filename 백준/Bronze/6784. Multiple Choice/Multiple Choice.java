import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		String[] ans = new String[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0;i<n;i++) {
			ans[i] = br.readLine();
		}
		
		int a = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i].equals(ans[i])) {
				a++;
			}
		}
		System.out.println(a);
	}
}