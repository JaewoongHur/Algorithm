import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] a = new String[]{"000000","001111","010011","011100","100110","101001","110101","111010"};
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		boolean pass = true;
		
		for(int i=0;i<n;i++) {
			String b = s.substring(6*i, 6*i+6);
			
			pass = true;
			
			for(int j=0;j<8;j++) {
				int diff = 0;
				for(int k=0;k<6;k++) {
					if(b.charAt(k) != a[j].charAt(k)) {
						diff++;
					}					
				}	
				
				if(diff<=1) {
					sb.append((char) ('A' + j));
					pass = false;
					break;
				}
			}
			
			if(pass) {
				System.out.println(i+1);
				break;
			}
		}
		
		
		if(!pass) {
			System.out.println(sb);
		}
	}
}