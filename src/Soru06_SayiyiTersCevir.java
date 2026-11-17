import java.util.Scanner;

/** Soru 6: Sayıyı Ters Çevirme */
public class Soru06_SayiyiTersCevir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        if (sayi <= 1) {
            asalMi = false;
        } else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(sayi + " bir asal sayidir.");
        } else {
            System.out.println(sayi + " asal bir sayi değildir.");
        }
        scanner.close();
    }
}
     
