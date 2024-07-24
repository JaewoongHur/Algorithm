import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		
		int[] factorial = new int[6];
		factorial[0] = 1;
		
		for(int i=1;i<6;i++) {
			factorial[i] = factorial[i-1]*i;	
		}
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int a = 0;
			
			for(int i=0;i<s.length();i++) {
				a += (s.charAt(i)-'0')*factorial[s.length()-i];
			}
			System.out.println(a);
		}		
	}
}