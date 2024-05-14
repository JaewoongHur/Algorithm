import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		int[] arr = new int[10001];
		
		int x = 1;
		int y = 1;
		
		int m = 0;
		
		for(int i=1;i<=10000;i++) {
			m += x;
			--y;
			
			arr[i] = m;
			
			if(y==0) {
				++x;
				y = x;
			}
		}
		
		while(true) {
			s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int a = Integer.parseInt(s);
			
			sb.append(a).append(' ').append(arr[a]).append('\n');			
		}
		
		System.out.println(sb);
		
	}
}