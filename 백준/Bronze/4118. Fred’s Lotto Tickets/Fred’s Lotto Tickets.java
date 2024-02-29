import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		String s;
		while(true) {
			s = br.readLine();
			if(s.equals("0")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			int[] a = new int[50];
			
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0;j<6;j++) {
					int k = Integer.parseInt(st.nextToken());
					
					a[k]++;
				}				
			}
			
			boolean pass = true;
			for(int i=1;i<=49;i++) {
				if(a[i]==0) {
					pass = false;
					break;
				}				
			}
			
			if(pass) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}
}