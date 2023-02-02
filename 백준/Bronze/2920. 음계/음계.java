import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[8];
		for(int i=0; i<8;i++) {
			A[i] = sc.nextInt();
		}
		int[] B = {1,2,3,4,5,6,7,8};
		int[] C = {8,7,6,5,4,3,2,1};
		
		if(Arrays.equals(A, B)) {
			System.out.println("ascending");
		}
		else if(Arrays.equals(A, C)) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
		}
		
		
	}

