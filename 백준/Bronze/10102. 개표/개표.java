import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		
		String s = br.readLine();
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)== 'A') {
				a++;
			}else {
				b++;
			}
		}
		
		if(a>b) {
			System.out.println("A");
		}else if(a==b) {
			System.out.println("Tie");
		}else {
			System.out.println("B");
		}
		
	}
}