import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;

		while (!(s = br.readLine()).equals("#")) {
			st = new StringTokenizer(s);
			
			StringBuilder sb = new StringBuilder();
			sb.append(s).append(' ');
			String a = st.nextToken();
			String b = st.nextToken();
			String c = st.nextToken();
			
			int n = a.length();
			
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				if(b.charAt(i)-a.charAt(i)>=0) {
				arr[i] = b.charAt(i)-a.charAt(i);
				}else {
					arr[i] = b.charAt(i)-a.charAt(i)+26;
				}
			}
			
			for(int i=0;i<n;i++) {
				sb.append((char)(((c.charAt(i)+arr[i]-'a')%26)+'a'));
			}
			System.out.println(sb);
		}
	}
}