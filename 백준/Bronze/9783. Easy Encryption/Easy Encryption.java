import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				if(Character.isLowerCase(s.charAt(i))) {
					int a = s.charAt(i)-'a'+1;
					
					if(a<10) {
						sb.append(0).append(a);
					}else {
						sb.append(a);
					}					
				}else {
					sb.append(s.charAt(i)-'A'+27);
				}				
			}else if(Character.isDigit(s.charAt(i))){
				sb.append('#').append(s.charAt(i));
			}else {
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb);
	}
}