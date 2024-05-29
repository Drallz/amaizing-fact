
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int name = x.nextInt();


        int n = 1;
        for (int i = 1 ; i <= name; i++){
            n = n * i;
        }

        System.out.println(name + "! is = " + n);
    }
}