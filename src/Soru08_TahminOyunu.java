import java.util.Scanner;

/** Soru 8: Tahmin Oyunu */
public class Soru08_TahminOyunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gizliSayi = 42; 
        int tahmin;

        System.out.println("1 ile 100 arasında bir sayı seçildi.");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin > gizliSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else if (tahmin < gizliSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Tebrikler, bildiniz!");
            }
        } while (tahmin != gizliSayi);

        scanner.close();
    }
}
