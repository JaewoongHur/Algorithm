import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		int a = 0;
		
		for(int i=0;i<9;i++) {
			s = br.readLine();
			
			if(s.equals("Lion")) {
				a++;
			}			
		}
		
		if(a>=5) {
			System.out.println("Lion");
		}else {
			System.out.println("Tiger");
		}
	}
}