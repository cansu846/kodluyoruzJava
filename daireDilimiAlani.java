import java.util.Scanner;

public class daireDilimiAlani {
    public static void main(String[] args){
        float r; //Daire yarıçapı
        float a; //Daire diliminin merkez açısı
        float toplamTutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Yarıçap giriniz:");
        r = scan.nextFloat();
        System.out.println("Daire diliminin merkez açısını giriniz:");
        a = scan.nextFloat();
        System.out.println("Daire dilimi alanı: " + ( Math.PI*r*r*a )/360 );

    }
}
