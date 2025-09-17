import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double a = Double.parseDouble(br.readLine());
		
		System.out.println(Math.sqrt((4*a)/Math.PI));
	}
}