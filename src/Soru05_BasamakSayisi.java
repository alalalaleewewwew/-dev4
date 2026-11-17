import java.util.Scanner;

/** Soru 5: Sayının Basamaklarını Bulma */
public class Soru05_BasamakSayisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayi girin");
        int sayi = scanner.nextInt();

        int temp = Math.abs(sayi);
        int basamakSayisi = 0;

        if (temp == 0) {
            basamakSayisi = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                basamakSayisi++;
            }
        }

        System.out.println("Basamak sayisi: " + basamakSayisi);
        scanner.close();
    }
}
      
