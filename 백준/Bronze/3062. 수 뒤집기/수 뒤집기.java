import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=n;tc++) {
			StringBuilder sb = new StringBuilder();
			String s = br.readLine();
			sb.append(s);			
			String rs = sb.reverse().toString();
			
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(rs);
			
			int x = a+b;
			
			String y = String.valueOf(x);
			
			boolean flag = true;
			
			for(int i=0;i<(y.length()+1)/2;i++) {
				if(y.charAt(i) != y.charAt(y.length()-i-1)) {
					flag = false;
				}				
			}
			
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}	
	}
}