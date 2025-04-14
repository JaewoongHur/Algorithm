import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String a = br.readLine();
		String b = br.readLine();
		
		int x = 0;
		int y = 0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='S') {
				if(b.charAt(i)=='P') {
					x++;
				}else if(b.charAt(i)=='R') {
					y++;
				}
			}else if(a.charAt(i)=='R') {
				if(b.charAt(i)=='P') {
					y++;
				}else if(b.charAt(i)=='S') {
					x++;
				}
			}else if(a.charAt(i)=='P') {
				if(b.charAt(i)=='R') {
					x++;
				}else if(b.charAt(i)=='S') {
					y++;
				}
			}
		}
		System.out.println(x + " " + y);
	}
}