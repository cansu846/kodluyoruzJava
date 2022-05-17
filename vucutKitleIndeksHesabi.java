import java.util.Scanner;

public class vucutKitleIndeksHesabi {
    public static void main(String[] args){
        float boy;
        float kilo;
        float bki;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz (Or: 1,75): ");
        boy = scan.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz (Or: 65): ");
        kilo = scan.nextFloat();
        bki = kilo / (boy * boy);
        System.out.println("BKI: " + bki );
    }
}
