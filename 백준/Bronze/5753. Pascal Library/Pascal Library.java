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
			
			if(s.equals("0 0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			boolean[] arr = new boolean[n];
			
			for(int i=0;i<d;i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j=0;j<n;j++) {
					int a = Integer.parseInt(st.nextToken());
					
					if(arr[j]) {
						continue;
					}
					
					if(a == 0) {
						arr[j] = true;
					}
				}
			}
			
			boolean pass = false;
			
			for(int i=0;i<n;i++) {
				if(!arr[i]) {
					pass = true;
					break;
				}				
			}
			
			if(pass) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}
}