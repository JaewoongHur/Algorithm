import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.next();
			if(s.equals("#")) {
				break;
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>17 || b>=80) {
				System.out.println(s+" Senior");
			}
			else {
				System.out.println(s+" Junior");
			}
		}

	}
}