import java.util.Scanner;

/** Soru 1: 1'den N'e Kadar Sayılar */
public class Soru01_SayilariYazdir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayisini girin: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}
