import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;
        int k = 1;
        while((s=br.readLine())!=null){
            st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            if(n == 0 ) break;

            if(n%2==1){
                for (int i = 1; i <= n/2; i++) {
                    st.nextToken();
                }
                double d = Double.parseDouble(st.nextToken());
                for (int i = n/2+2; i <= n ; i++) {
                    st.nextToken();
                }
                System.out.print("Case " + k +": ");
                System.out.printf("%.1f", d);
                System.out.println();

            }
            else{
                for (int i = 1; i < n/2; i++) {
                    st.nextToken();
                }
                double e = Double.parseDouble(st.nextToken());
                double f = Double.parseDouble(st.nextToken());
                for (int i = n/2+2; i <= n ; i++) {
                    st.nextToken();
                }
                System.out.print("Case " + k +": ");
                System.out.printf("%.1f",(e+f)/2);
                System.out.println();
            }
            k++;
        }

    }
}