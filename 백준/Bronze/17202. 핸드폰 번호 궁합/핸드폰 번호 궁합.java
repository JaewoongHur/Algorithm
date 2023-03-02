import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s1= br.readLine();
		String s2= br.readLine();
		String s3 = "";
		
		for(int i = 0 ;i<8;i++) {
			s3 += s1.charAt(i);
			s3 += s2.charAt(i);
		}
		
		while(s3.length()>2) {
			String s4="";
			for(int i = 0 ;i<s3.length()-1;i++) {
				s4 += (s3.charAt(i) + s3.charAt(i+1) -2*'0')%10;
			}
			s3 =s4;
		}
		System.out.println(s3);
	}
}