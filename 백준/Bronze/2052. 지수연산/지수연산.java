import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        BigDecimal val = new BigDecimal("2");
        BigDecimal k = val.pow(n);
        BigDecimal ans = BigDecimal.ONE.divide(k);
        	
        System.out.println(ans.toPlainString());
        
    }
}