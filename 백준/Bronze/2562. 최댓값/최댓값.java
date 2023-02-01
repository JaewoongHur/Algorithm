import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];
		for(int i=0; i<9;i++) {
			A[i] = sc.nextInt();
		}
		
		int max = A[0];
		int n = 0;
		for(int i=0;i<9;i++) {
			if(max < A[i]) {
				max = A[i];
				n = i;
			}
		}
		System.out.println(max);
		System.out.println(n+1);
		sc.close();
	}
}
