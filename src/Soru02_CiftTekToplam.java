import java.util.Scanner;

/** Soru 2: Çift ve Tek Sayıların Toplamı */
public class Soru02_CiftTekToplam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayisini girin: ");
        int n = scanner.nextInt();

        int ciftToplam = 0;
        int tekToplam = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ciftToplam += i;
            } else {
                tekToplam += i;
            }
        }

        System.out.println("Çift sayilarin toplami: " + ciftToplam);
        System.out.println("Tek sayilarin toplami: " + tekToplam);
        scanner.close();
    }
}
