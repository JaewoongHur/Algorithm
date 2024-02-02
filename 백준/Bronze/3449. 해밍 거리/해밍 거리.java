import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			String a = br.readLine();
			String b = br.readLine();
			
			int k = a.length();
			
			int x = 0;
			
			for(int i=0;i<k;i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					x++;
				}
			}
			System.out.println("Hamming distance is "+ x +".");
		}
	}
}