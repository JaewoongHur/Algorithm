import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			String star = "";
			for(int j=0; j<i+1;j++) {
				star = star+"*";
			}
		System.out.printf("%"+N+"s\n", star);
			}	
		sc.close();
		}
	}