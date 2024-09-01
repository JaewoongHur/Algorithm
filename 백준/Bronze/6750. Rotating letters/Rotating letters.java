import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		boolean pass = true;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='S'||s.charAt(i)=='H'||s.charAt(i)=='X'||s.charAt(i)=='Z'||s.charAt(i)=='N') {
				continue;
			}
			
			pass = false;
			break;
		}

		if(pass) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}