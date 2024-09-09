import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine().trim());
		int ans = 0;
		
		for(int i=1;i<=n-3;i++){
		  for(int j=i+1;j<=n-2;j++){
		    for(int k=j+1;k<=n-1;k++){
		      ans++;
		    }
		  }
		}
		
		System.out.println(ans);
	}
}