import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int N = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		
		int y = 0;
		int m = 0;
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(st.nextToken());
			
			int b1 = a/30 + 1;
			y += b1*10;
			
			
			int b2 = a/60 + 1;
			m += b2*15;
		}
		if(y>m) {
			System.out.println("M "+ m);
		}
		else if(y==m) {
			System.out.println("Y M "+y);
		}
		else {
			System.out.println("Y "+ y);
		}
		
	}
}