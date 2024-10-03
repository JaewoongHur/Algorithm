import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] a = br.readLine().split(" ");
		
		int n = Integer.parseInt(a[0]);
		
		int s = Integer.parseInt(a[1]);
		
		int v = 0;
		
		for(int tc=0;tc<n;tc++) {
			int k = Integer.parseInt(br.readLine());
			
			v += k;
			
			if(tc == n-1) {
				break;
			}
			
			if(v>s) {
				v--;
			}
			
		}
		
		System.out.println(v);
		
	}
}