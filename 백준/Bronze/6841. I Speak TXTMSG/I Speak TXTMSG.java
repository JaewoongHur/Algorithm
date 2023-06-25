import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String s = sc.next();
			if(s.equals("CU")) {
				System.out.println("see you");
			}
			else if(s.equals(":-)")){
				System.out.println("I’m happy");
			}
			else if(s.equals(":-(")){
				System.out.println("I’m unhappy");
			}
			else if(s.equals(";-)")) {
				System.out.println("wink");
			}
			else if(s.equals(":-P")) {
				System.out.println("stick out my tongue");
			}
			else if(s.equals("(~.~)")) {
				System.out.println("sleepy");
			}
			else if(s.equals("TA")) {
				System.out.println("totally awesome");
			}
			else if(s.equals("CCC")) {
				System.out.println("Canadian Computing Competition");
			}
			else if(s.equals("CUZ")) {
				System.out.println("because");
			}
			else if(s.equals("TY")) {
				System.out.println("thank-you");
			}
			else if(s.equals("YW")) {
				System.out.println("you’re welcome");
			}
			else if(s.equals("TTYL")){
				System.out.println("talk to you later");
			}
			else {
				System.out.println(s);
			}
		}
	}
}