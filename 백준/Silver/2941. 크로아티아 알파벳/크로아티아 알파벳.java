import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int cnt = 0;
		int n = S.length();
		for(int i=0; i<n-1; i++) {
			if(S.charAt(i)== 'c' && (S.charAt(i+1) == '='|S.charAt(i+1) == '-')) {
				cnt++;
			}
			else if(i<n-2 && S.charAt(i) == 'd' && S.charAt(i+1) == 'z' && S.charAt(i+2)=='=' ) {
				cnt += 2;
			}
			else if(S.charAt(i) =='d'&& S.charAt(i+1)=='-') {
				cnt++;
			}
			else if(S.charAt(i)=='l'&& S.charAt(i+1) =='j') {
				cnt++;
			}
			else if(S.charAt(i)=='n'&& S.charAt(i+1) =='j') {
				cnt++;
			}
			else if(S.charAt(i)=='s'&& S.charAt(i+1) =='=') {
				cnt++;
			}
			else if(((i>=1 && S.charAt(i-1)!='d')|(i==0))&& S.charAt(i)=='z'&& S.charAt(i+1) =='=') {
				cnt++;
			}
			
		}
		System.out.println(S.length()-cnt);
	}
}
