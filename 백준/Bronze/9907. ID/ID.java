import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int[] arr = new int[] {2,7,6,5,4,3,2};
		
		int a = 0;
		
		for(int i=0;i<7;i++) {
			a += (s.charAt(i)-'0')*arr[i];			
		}
		
		a = a % 11;
		
		char c = ' ';
		
		if(a>0 && a<10) {
			c = (char) ((a-1)+'A');
		}else if(a==0) {
			c = 'J';
		}else {
			c = 'Z';
		}
		
		System.out.println(c);
		
	}
}