import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		if(a==0 && b==0) {
			System.out.println("Not a moose");
		}
		else if(a == b) {
			System.out.println("Even "+ 2*a);
		}
		else if(a>b){
			System.out.println("Odd "+ 2*a);
		}else if(a<b) {
			System.out.println("Odd "+ 2*b);
		}
	}
}