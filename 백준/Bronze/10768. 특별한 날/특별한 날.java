import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a==1){
            System.out.println("Before");
        }
        else if(a==2){
            if(b<18){
                System.out.println("Before");
            }
            else if(b==18){
                System.out.println("Special");
            }
            else{
                System.out.println("After");
            }
        }
        else{
            System.out.println("After");
        }
    }
}