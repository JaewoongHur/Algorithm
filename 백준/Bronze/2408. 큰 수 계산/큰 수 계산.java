import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger current = new BigInteger(br.readLine());
        List<Object> operations = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            String operator = br.readLine();
            BigInteger nextNumber = new BigInteger(br.readLine());

            if (operator.equals("*") || operator.equals("/")) {
                current = performOperation(current, nextNumber, operator);
            } else {
                operations.add(current);
                operations.add(operator);
                current = nextNumber;
            }
        }
        operations.add(current);

        BigInteger result = (BigInteger) operations.get(0);
        for (int i = 1; i < operations.size(); i += 2) {
            String operator = (String) operations.get(i);
            BigInteger nextNumber = (BigInteger) operations.get(i + 1);
            result = performOperation(result, nextNumber, operator);
        }

        System.out.println(result);
    }

    private static BigInteger performOperation(BigInteger a, BigInteger b, String operator) {
        switch (operator) {
            case "+":
                return a.add(b);
            case "-":
                return a.subtract(b);
            case "*":
                return a.multiply(b);
            case "/":
                if (a.compareTo(BigInteger.ZERO) < 0 != b.compareTo(BigInteger.ZERO) < 0 && !b.equals(BigInteger.ZERO)) {
                    return a.divide(b).subtract(BigInteger.ONE);
                } else {
                    return a.divide(b);
                }
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}