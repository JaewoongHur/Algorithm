import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		int[] arr;
		
		while(true) {
			a++;
			
			arr = new int[10];
			
			String s = String.valueOf(a);
			
			for(int i=0;i<s.length();i++) {
				arr[s.charAt(i)-'0']++;
			}
			
			boolean pass = true;
			
			for(int i=0;i<10;i++) {
				if(arr[i]>=2) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				System.out.println(s);
				break;
			}
			
			a = Integer.parseInt(s);
		}
	}
}