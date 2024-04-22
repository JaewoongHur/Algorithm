import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine().trim());

		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			
			int a = Integer.parseInt(s[0]);
			
			String b = Integer.toBinaryString(a);
			
			int k = 0;
			
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)=='1') {
					k++;
				}
			}
			
			if(k % 2 == 1) {
				if (s[1].equals("1")) {
					System.out.println("Valid");
				}else {
					System.out.println("Corrupt");
				}
			}else {
				if(s[1].equals("1")) {
					System.out.println("Corrupt");
				}else {
					System.out.println("Valid");
				}
			}
		}
	}
}