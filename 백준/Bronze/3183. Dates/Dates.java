import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		StringTokenizer st;
		
		int[] day = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		while(true) {
			s = br.readLine();
			if(s.equals("0 0 0")) {
				break;
			}
			
			st = new StringTokenizer(s);
			
			
			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(y>2200 || y<1700) {
				System.out.println("Invalid");
				continue;
			}
			
			if(m>12 || m<1) {
				System.out.println("Invalid");
				continue;
			}
			
			if(m==2) {
				boolean isLeapYear = false;
				
				if(y%4 == 0) {
					if(y%100 !=0) {
						isLeapYear = true;
					}else {
						if(y%400 ==0) {
							isLeapYear = true;
						}
					}
				}
				
				if(isLeapYear) {
					if(d>29 || d<1) {
						System.out.println("Invalid");
						continue;
					}
				}else {
					if(d>28 || d<1) {
						System.out.println("Invalid");
						continue;
					}
				}
			}else {
				if(d>day[m] || d<1) {
					System.out.println("Invalid");
					continue;
				}
			}
			System.out.println("Valid");
		}
	}
}