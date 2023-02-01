import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<=N;i++) {
		int a = i%10;
		int b = (i/10)%10;
		int c = (i/100)%10;
		int d = (i/1000)%10;
			if(i<100) {
				cnt++;				
			}
			else if(100<=i && i<1000) {
				if( c-b == b-a)
					cnt++;
			}
			else {
				if(d-c == c-b && c-b == b-a) 
					cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
