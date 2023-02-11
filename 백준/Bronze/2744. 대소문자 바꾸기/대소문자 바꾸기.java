import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		int n = a.length();
		StringBuilder sb = new StringBuilder();	
		for(int i=0;i<n;i++) {
			if(a.charAt(i)>=97) {
				char c = (char)(a.charAt(i)-' ');
				sb.append(c);
			}
			else{
				char c = (char)(a.charAt(i)+' ');
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}