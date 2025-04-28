import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String s = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		int m = s.length();
		
		char[] arr = new char[m];
		
		for(int i=0;i<m;i++) {
			arr[i] = s.charAt(i);
		}
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());	
			
			char tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<m;i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb);
	}
}