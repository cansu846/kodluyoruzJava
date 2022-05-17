import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args){
        float armutKilo;
        float elmatKilo;
        float domatesKilo;
        float muzKilo;
        float paticanKilo;
        float toplamFiyat = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Armut kaç kilo (ör: 1,2): ");
        armutKilo = scan.nextFloat();
        toplamFiyat += armutKilo * 2.14;

        System.out.println("Elam kaç kilo (ör: 1,2): ");
        elmatKilo = scan.nextFloat();
        toplamFiyat += elmatKilo * 3.67;

        System.out.println("Domates kaç kilo (ör: 1,2): ");
        domatesKilo = scan.nextFloat();
        toplamFiyat += domatesKilo * 1.11;

        System.out.println("Muz kaç kilo (ör: 1,2): ");
        muzKilo = scan.nextFloat();
        toplamFiyat += muzKilo * 0.95;

        System.out.println("Patıcan kaç kilo (ör: 1,2): ");
        paticanKilo = scan.nextFloat();
        toplamFiyat += paticanKilo * 5.00;

        System.out.println( "Toplam Tutar : " + toplamFiyat );
    }
}
