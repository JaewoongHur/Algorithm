import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		
		while((str = br.readLine())!=null){
			st = new StringTokenizer(str);
			
			int m = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
					
			for(int i=1;i<=n;i++) {		
				int tmp = m*e;
				
				m = p/s;
				p = l/r;
				l = tmp;	
			}
			System.out.println(m);
		}
	}
}