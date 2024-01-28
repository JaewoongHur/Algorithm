import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		if(s.length()%3 == 1) {
			s = "00" + s;
		}else if(s.length()%3 == 2) {
			s = '0' + s;
		}
		
		
		for(int i=0;i<s.length();i+=3) {
			if(s.substring(i,i+3).equals("000")) {
				sb.append('0');
			}else if(s.substring(i,i+3).equals("001")) {
				sb.append('1');
			}else if(s.substring(i,i+3).equals("010")) {
				sb.append('2');
			}else if(s.substring(i,i+3).equals("011")) {
				sb.append('3');
			}else if(s.substring(i,i+3).equals("100")) {
				sb.append('4');
			}else if(s.substring(i,i+3).equals("101")) {
				sb.append('5');
			}else if(s.substring(i,i+3).equals("110")) {
				sb.append('6');
			}else if(s.substring(i,i+3).equals("111")) {
				sb.append('7');
			}
		}
		System.out.println(sb);
	}
}