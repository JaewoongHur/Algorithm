import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int isPalindrome(String s,int b, int e) {
		if(b>=e) {
			return 1;
		}
		else {
			
		if(s.charAt(b)==s.charAt(e)) {
			return isPalindrome(s, b+1,e-1);
			}
		else {
			return 0;
		}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(isPalindrome(s, 0, s.length()-1));
	
	}
}