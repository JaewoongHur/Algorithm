import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int d = Integer.parseInt(st.nextToken());
		
		int[] list = new int[d];
		
		for(int i=0;i<d;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		String[] diseases = new String[n+1];
		
		for(int i=1;i<=n;i++) {
			diseases[i] = br.readLine();
		}
		
		boolean[] check = new boolean[m+1];
		
		for(int i=0;i<d;i++) {
			st = new StringTokenizer(diseases[list[i]]);
			int k = Integer.parseInt(st.nextToken());
			
			for(int j=0;j<k;j++) {
				int a = Integer.parseInt(st.nextToken());
				check[a] = true;
			}
		}
		
		boolean pass = true;
		
		for(int i=1;i<=m;i++) {
			if(!check[i]) {
				pass = false;
			}
		}
		
		if(pass) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
}