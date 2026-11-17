import java.util.Scanner;

/** Soru 9: Sayıların Ortalaması */
public class Soru09_SayilarinOrtalamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int pozitif = 0, negatif = 0, sifir = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanner.nextInt();
            toplam += sayi;

            if (sayi > 0) {
                pozitif++;
            } else if (sayi < 0) {
                negatif++;
            } else {
                sifir++;
            }
        }

        double ortalama = (double) toplam / 10;

        System.out.println("Toplam: " + toplam);
        System.out.println("Aritmetik Ortalama: " + ortalama);
        System.out.println("Pozitif sayı adedi: " + pozitif);
        System.out.println("Negatif sayı adedi: " + negatif);
        System.out.println("Sıfır adedi: " + sifir);

        scanner.close();
    }
}
