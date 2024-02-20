import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		
		double a = (double)1/(double)3;
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		
		for(int i=1;i<=(int)Math.pow(n,a)+1;i++) {
			if(n%i !=0) {
				continue;
			}
			int b = n / i;
			
			for(int j=1;j<=(int)Math.sqrt(b)+1;j++) {
				if(b % j !=0) {
					continue;
				}
				int c = b / j;
				
				if(min > 2*(i*j + j*c + c*i)) {
					min = 2*(i*j + j*c + c*i);
					
					x = i;
					y = j;
					z = c;
				}
			}
			
		}
		
		System.out.println(x + " " + y + " " + z);
	}
}