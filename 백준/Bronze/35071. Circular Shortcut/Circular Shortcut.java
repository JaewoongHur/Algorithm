import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		double n = Double.parseDouble(br.readLine());
		
		System.out.println((Math.PI/2 - 1) * n);
	}
}
