import java.util.Scanner;

/** Soru 10: Menü Tabanlı İşlem Programı */
public class Soru10_MenuProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1: Bir sayinin karesini hesapla");
            System.out.println("2: Bir sayinin küpünü hesapla");
            System.out.println("3: Bir sayinin tek veya çift oldugunu kontrol et");
            System.out.println("4: Bir sayinin pozitif, negatif veya sifir oldugunu belirle");
            System.out.println("5: Programdan çik");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            if (secim == 5) {
                System.out.println("Programdan çikiliyor.");
                break;
            }

            if (secim >= 1 && secim <= 4) {
                System.out.print("İşlem yapılacak sayiyi girin: ");
                int sayi = scanner.nextInt();

                switch (secim) {
                    case 1:
                        System.out.println("Karesi: " + (sayi * sayi));
                        break;
                    case 2:
                        System.out.println("Küpü: " + (sayi * sayi * sayi));
                        break;
                    case 3:
                        if (sayi % 2 == 0) {
                            System.out.println("Sayi çifttir.");
                        } else {
                            System.out.println("Sayi tektir.");
                        }
                        break;
                    case 4:
                        if (sayi > 0) {
                            System.out.println("Sayi pozitiftir.");
                        } else if (sayi < 0) {
                            System.out.println("Sayi negatiftir.");
                        } else {
                            System.out.println("Sayi sıfırdır.");
                        }
                        break;
                }
            } else {
                System.out.println("Geçersiz seçim, tekrar deneyin.");
            }

        } while (secim != 5);

        scanner.close();
    }
}
