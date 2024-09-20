import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		String[] adjective = new String[n];
		String[] noun = new String[m];
		
		for(int i=0;i<n;i++) {
			adjective[i] = br.readLine();
		}
		
		for(int i=0;i<m;i++) {
			noun[i] = br.readLine();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println(adjective[i] + " as " + noun[j]);
			}			
		}
	}
}