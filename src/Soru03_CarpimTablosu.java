import java.util.Scanner;

/** Soru 3: Çarpım Tablosu */
public class Soru03_CarpimTablosu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + (sayi * i));
        }
        scanner.close();
    }
}
