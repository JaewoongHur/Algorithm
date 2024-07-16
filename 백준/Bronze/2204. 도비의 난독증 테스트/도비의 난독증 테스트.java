import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int n = Integer.parseInt(s);
			
			String[] arr = new String[n];
			String[] comp = new String[n];
			
			for(int i=0;i<n;i++) {		
				String a = br.readLine();
				arr[i] = a;
				StringBuilder sb = new StringBuilder();
				
				for(int j=0;j<a.length();j++) {
					sb.append(Character.toLowerCase(a.charAt(j)));
				}
				
				comp[i] = sb.toString();
			}
			
			Arrays.sort(comp);
			
			String k = comp[0];
			int m = 0;
			out: for(int i=0;i<n;i++) {
				String a = arr[i];
				
				if(k.length() != a.length())continue;
				
				for(int j=0;j<a.length();j++) {
					if(Character.toLowerCase(a.charAt(j))!=k.charAt(j)) {
						continue out;
					}
				}
				m = i;
			}
			System.out.println(arr[m]);
		}
	}
}