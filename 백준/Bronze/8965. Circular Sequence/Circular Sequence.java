import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<T;tc++) {
			String s = br.readLine();
			
			int n = s.length();
			
			char[] c = s.toCharArray();
			
			String[] arr = new String[n];
			
			for(int i=0;i<n;i++) {
				String a = "";
				for(int j=0;j<n;j++) {
					a += c[(i+j)%n];
				}
				arr[i] = a;
			}
			Arrays.sort(arr);
			System.out.println(arr[0]);
		}
	}
}