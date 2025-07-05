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
		int q = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[n][m];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			for(int j=0;j<m;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		boolean[] check = new boolean[n];
		
		for(int k=0;k<q;k++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			char b = st.nextToken().charAt(0);
			
			for(int i=0;i<n;i++) {
				if(check[i]) continue;
				
				if(arr[i][a-1] != b) {
					check[i] = true;
				}
			}
		}
		
		int num = 0;
		int idx = 0;
		
		for(int i=0;i<n;i++) {
			if(!check[i]) {
				idx = i+1;
				num++;
			}
		}
		
		if(num == 1) {
			System.out.println("unique");
			System.out.println(idx);
		}else {
			System.out.println("ambiguous");
			System.out.println(num);
		}
	}
}
