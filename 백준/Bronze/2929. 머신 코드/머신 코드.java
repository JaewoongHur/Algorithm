import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		int ans = 0;
		
		int a = 0;
		for(int i=1;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				int k = (3-a)%4;
				
				if(k<0) {
					k+=4;
				}
				
				ans+=k;
				
				a = 0;
			}else {
				a++;
			}	
		}
		
		System.out.println(ans);
	}
}