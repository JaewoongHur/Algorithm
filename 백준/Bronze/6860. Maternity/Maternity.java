import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc = 0;tc<n;tc++) {
			String s = br.readLine();
			
			boolean pass = true;
			
			for(int i=0;i<5;i++) {
				if(Character.isUpperCase(a.charAt(2*i))&& Character.isUpperCase(a.charAt(2*i+1))&&Character.isLowerCase(s.charAt(i))){
					pass = false;
					break;
				}else if(Character.isUpperCase(b.charAt(2*i))&& Character.isUpperCase(b.charAt(2*i+1))&&Character.isLowerCase(s.charAt(i))) {
					pass = false;
					break;
				}else if(!Character.isUpperCase(a.charAt(2*i))&& !Character.isUpperCase(a.charAt(2*i+1))&&!Character.isUpperCase(b.charAt(2*i))&&!Character.isUpperCase(b.charAt(2*i+1))&&!Character.isLowerCase(s.charAt(i))) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				System.out.println("Possible baby.");
			}else {
				System.out.println("Not their baby!");
			}
			
		}
	}
}