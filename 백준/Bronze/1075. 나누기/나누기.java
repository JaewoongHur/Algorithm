import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());

		N -= N % 100;
		
		int r = 0;	
		
		for(int i=0;i<100;i++) {
			if((N+i)%F==0) {
				r = i;
				
				break;
			}			
		}
		
		if(r==0) {
			System.out.println("00");
		}
		else if(r<10) {
			System.out.println("0"+r);
		}
		else {
			System.out.println(r);
		}
		
	}
}