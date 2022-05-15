import java.util.Scanner;
import java.math.*;
public class ucgenAlan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1.kenar uzunluğu: ");
        float kenar1 = scan.nextFloat();
        System.out.print("2.kenar uzunluğu: ");
        float kenar2 = scan.nextFloat();
        System.out.print("3.kenar uzunluğu: ");
        float kenar3 = scan.nextFloat();
       float cevre = (kenar1 + kenar2 + kenar3);
       float u = cevre/2;
       float alan = (float)Math.sqrt( u*(u-kenar1)*(u-kenar2)*(u-kenar3) );
        System.out.println(alan);
    }
}
