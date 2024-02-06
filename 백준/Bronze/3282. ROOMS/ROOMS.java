import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]);
		int g = Integer.parseInt(s[1]);
		
		
		int[] room = new int[n];
		
		boolean full = false;
		
		for(int tc=0;tc<g;tc++) {
			
			int a = Integer.parseInt(br.readLine());
			
			for(int i=0;i<n;i++) {
				if(room[i] !=0) {
					continue;
				}
				
				if(a>=2) {
					a -= 2;
					room[i] += 2;
				}else if(a == 1) {
					--a;
					++room[i];
				}else if(a==0) {
					break;
				}
				
				if(!full && room[n-1]>0) {
					full = true;
				}
			}
			
			if(!full) {
				continue;
			}
			
			for(int i=0;i<n;i++) {
				if(room[i]==2) {
					continue;
				}else {
					if(a>0) {
						--a;
						++room[i];
					}else {
						break;
					}
				}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(room[i]);
		}
		
	}
}