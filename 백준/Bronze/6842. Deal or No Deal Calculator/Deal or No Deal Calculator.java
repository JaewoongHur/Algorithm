import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] bc = new double[] {0,100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
		
		int n = Integer.parseInt(br.readLine());
		
		double total = 0;
		
		for(int i=1;i<=10;i++) {
			total += bc[i];
		}
		
		double avg = 0;
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			
			total -= bc[a];
		}
		
		avg = total/(10-n);
		
		double offer = Double.parseDouble(br.readLine());
		
		if(offer >= avg) {
			System.out.println("deal");
		}else {
			System.out.println("no deal");
		}
	}
}