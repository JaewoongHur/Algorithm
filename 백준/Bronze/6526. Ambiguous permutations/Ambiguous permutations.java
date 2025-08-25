import java.io.*;
import java.util.*;

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
			
			int[] arr = new int[n+1];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=1;i<=n;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int[] rev = new int[n+1];
			
			for(int i=1;i<=n;i++) {
				rev[arr[i]] = i;
			}
			
			boolean amb = true;
			
			for(int i=1;i<=n;i++) {
				if(arr[i] != rev[i]) {
					amb = false;
					break;
				}
			}
			
			if(amb) {
				System.out.println("ambiguous");
			}else {
				System.out.println("not ambiguous");
			}
		}
	}
}