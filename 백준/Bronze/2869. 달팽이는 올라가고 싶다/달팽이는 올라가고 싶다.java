import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
			
		int d = (V-B)/(A-B);
		
		if((V-A) % (A-B) !=0) {
			d++;
			}		
		System.out.println(d);
		}
	}
