import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);

		int[] freq = new int[a+b+1];
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				freq[i+j]++;
			}
		}
		
		int max = 0;
		
		for(int i=2;i<a+b+1;i++) {
			max = Math.max(max, freq[i]);
		}
		
		for(int i=2;i<a+b+1;i++) {
			if(max == freq[i]) {
				System.out.println(i);
			}
		}
	}
}