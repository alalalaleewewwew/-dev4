import java.util.Scanner;

/** Soru 4: Faktöriyel Hesaplama */
public class Soru04_Faktoriyel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayi girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Hata: Negatif sayilarin faktöriyelik hesabi yapılamaz.");
        } else {
            long faktoriyel = 1;
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }
            System.out.println(sayi + "! = " + faktoriyel);
        }
        scanner.close();
    }
}
