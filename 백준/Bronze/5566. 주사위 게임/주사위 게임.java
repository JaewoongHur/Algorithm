import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		
		int m = Integer.parseInt(s[1]);
		
		int[] arr = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int a = 1;
		int c = 1;
		
		for(int i=0;i<m;i++) {
			int k = Integer.parseInt(br.readLine());
			
			a += k;
			
			if(a>=n) {
				System.out.println(c);
				break;
			}
			
			a += arr[a];
			
			if(a>=n) {
				System.out.println(c);
				break;
			}
			
			if(a<=0) {
				a = 1;
			}
			
			c++;
		}
		
	}
}