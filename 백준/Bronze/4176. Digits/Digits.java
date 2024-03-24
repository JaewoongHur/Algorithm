import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("END")) {
				break;
			}
			
			if(s.length() == 1) {
				if(s.equals("1")) {
					System.out.println(1);
				}else {
					System.out.println(2);
				}
			}else {
				int k = 2;
				int a = s.length();
				int b = String.valueOf(a).length();
				
				while(a!=b) {
					a = b;
					b = String.valueOf(a).length();
					k++;				
				}
				System.out.println(k);				
			}			
		}	
	}
}