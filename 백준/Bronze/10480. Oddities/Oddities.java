import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a%2==0){
                System.out.println(a+" is even");
            }
            else{
                System.out.println(a+" is odd");
            }
        }


    }
}