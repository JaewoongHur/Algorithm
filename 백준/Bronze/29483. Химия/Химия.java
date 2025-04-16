import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		char cur = ' ';
		
		int mass = 0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				cur = s.charAt(i);
				
				switch(cur) {
				case 'H':
					mass += 1;
					break;
				case 'C':
					mass += 12;
					break;
				case 'N':
					mass += 14;
					break;
				default :
					mass += 16;
					break;
				}
				
			}else {
				int a = s.charAt(i) - '0'- 1;
				
				switch(cur) {
				case 'H':
					mass += 1*a;
					break;
				case 'C':
					mass += 12*a;
					break;
				case 'N':
					mass += 14*a;
					break;
				default :
					mass += 16*a;
					break;
				}
			}			
		}
		System.out.println(mass);
	}
}