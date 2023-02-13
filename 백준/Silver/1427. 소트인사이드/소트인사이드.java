import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		int L = N.length();
		int[] A = new int[L];
		for(int i=0;i<L;i++) {
			A[i] = N.charAt(i)-'0';
		}
		for(int i=0; i<L-1;i++) {
			for(int j=0; j<L-i-1;j++) {
				if(A[j]<A[j+1]) {
					int tmp = A[j+1];
					A[j+1] = A[j];
					A[j] = tmp;	
				}
			}
		}
		for(int x : A) {
			System.out.print(x);
		}
		
	}
}