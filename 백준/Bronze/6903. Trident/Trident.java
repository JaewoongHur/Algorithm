import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		int h = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < 1 + t + h; i++) {
			for (int j = 0; j < 3 + 2 * s; j++) {
				if(i<t) {
					if(j==0 || j==1+s || j == 2 + 2*s) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}					
				}else if(i == t) {
					System.out.print("*");
				}else {
					if(j == 1+s) {
						System.out.print("*");
						break;
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}