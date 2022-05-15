import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float kdv;
        float fiyat;
        float kdvli_tutar;
        float kdv_tutar;
        System.out.println("Fiyat Giriniz");
        fiyat = scan.nextFloat();
        if(fiyat>=0 && fiyat<=1000){
            kdv = (float) (18/100);
        }else{
            kdv =  (float)  8/100;
        }
        kdv_tutar = fiyat*kdv;
        kdvli_tutar = kdv_tutar + fiyat;
        System.out.println("KDV siz fiyat: " + fiyat);
        System.out.println("KDV li fiyat: " + kdvli_tutar);
        System.out.println("KDV tutarı: " + kdv_tutar);

    }
}
