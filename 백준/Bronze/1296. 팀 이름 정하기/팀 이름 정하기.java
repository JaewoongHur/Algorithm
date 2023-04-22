import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = 0, O = 0, V = 0, E = 0;

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'L':
				L++;
				break;
			case 'O':
				O++;
				break;
			case 'V':
				V++;
				break;
			case 'E':
				E++;
				break;
			}
		}

		int N = Integer.parseInt(br.readLine());
		String Winner = "";
		int max = -1;
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			int l = L, o = O, v = V, e = E;
			
			for (int j = 0; j < s.length(); j++) {
				switch (s.charAt(j)) {
				case 'L':
					l++;
					break;
				case 'O':
					o++;
					break;
				case 'V':
					v++;
					break;
				case 'E':
					e++;
					break;
				}
				
			}
			int probability = ((l+o)*(l+v)*(l+e)*(o+v)*(o+e)*(v+e)) % 100;
			if(max<probability) {
				max = probability;
				Winner = s;
			}
			else if(max == probability) {
				if(s.compareTo(Winner)<=0) {
					Winner = s;				
				}
			}
		}
		System.out.println(Winner);
	}
}