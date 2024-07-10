import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        
        while (true) {
            s = br.readLine();
            if (s.equals("0")) {
                break;
            }

            boolean[] arr = new boolean[10000];
            int a = Integer.parseInt(s);
            int cnt = 0;

            while (!arr[a]) {
                arr[a] = true;
                cnt++;
                int b = a * a;
                String c = String.format("%08d", b); // 8자리로 패딩
                a = Integer.parseInt(c.substring(2, 6));
            }
            
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}