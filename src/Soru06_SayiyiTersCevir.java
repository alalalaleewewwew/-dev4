import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        int tersSayi = 0;
        int gecici = sayi;

        while (gecici != 0) {
            int basamak = gecici % 10;
            tersSayi = tersSayi * 10 + basamak;
            gecici /= 10;
        }

        System.out.println("Ters hali: " + tersSayi);
        scanner.close();
    }
}
