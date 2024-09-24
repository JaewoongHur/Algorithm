import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		String[] roman = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII"};
		
		for(int i=1;i<=12;i++) {
			if(s.contains(roman[i])) {
				System.out.print(i + " ");
			}
		}
	}
}