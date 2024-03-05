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
			
			boolean pass = true;
			
			st = new StringTokenizer(s);
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			String[] arr = new String[n];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<n;i++) {
				arr[i] = st.nextToken();
			}
			
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(br.readLine());
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				int x = 0;
				for(int j=0;j<a;j++) {
					String c = st.nextToken();
					
					for(int k=0;k<n;k++) {
						if(arr[k].equals(c)) {
							x++;
						}
					}
				}
				if(b>x) {
					pass = false;
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