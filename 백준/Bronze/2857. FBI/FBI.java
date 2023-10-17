import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		
		boolean pass = true;
		for(int i=0;i<5;i++) {
			s = br.readLine();
			boolean find = false;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='-') {
					if(find) {
						find = false;
						continue;
					}
				}
				if(!find) {
					if(j+2<s.length() && s.charAt(j)=='F' && s.charAt(j+1)=='B' && s.charAt(j+2)=='I') {
						find = true;
						pass = false;
						System.out.print(i+1 +" ");
					}
				}
				
			}
		
		}
		if(pass) {
			System.out.println("HE GOT AWAY!");
		}
		
	}
}