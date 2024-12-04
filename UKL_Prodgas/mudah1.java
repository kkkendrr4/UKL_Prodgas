import java.util.Scanner;

public class mudah1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarakminimum = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int volumeminimum = 100;

        System.out.println(" ");
        System.out.println("================================================ ");
        System.out.println("SELAMAT DATANG DI DAVID's XPRESSSSSSSSSSS ");
        System.out.println("================================================ ");

        System.out.println("Masukkan Berat Barang: (kg)");
        int berat = input.nextInt();

        System.out.println("================================================ ");
        System.out.println("Masukkan Jarak Tempuh: (km)");
        int jaraktempuh = input.nextInt();
        System.out.println("================================================ ");

        int volume = hitungvol(input);

        int totalharga = hitungharga(jaraktempuh, jarakminimum, berat, volume, harga1, harga2, harga3, volumeminimum);

        System.out.println("================================================ ");
        System.out.println("TOTAL BIAYA YANG HARUS ANDA BAYAR ADALAH: " + totalharga);
        System.out.println(" ");
    }

    public static int hitungvol(Scanner scanner) {
        System.out.println("Masukkan Panjang Barang: ");
        int p = scanner.nextInt();

        System.out.println("================================================ ");
        System.out.println("Masukkan Tinggi Barang: ");
        int t = scanner.nextInt();

        System.out.println("================================================ ");
        System.out.println("Masukkan Lebar Barang: ");
        int l = scanner.nextInt();

        return p * l * t;
    }

    public static int hitungharga(int jaraktempuh, int jarakminimum, int berat, int volume, int harga1, int harga2, int harga3, int volumeminimum) {
        int result;

        if (jaraktempuh <= jarakminimum) {
            result = harga1 * berat;
            if (volume > volumeminimum) {
                result += harga3;
            }
        } else {
            result = harga2 * berat;
            if (volume > volumeminimum) {
                result += harga3;
            }
        }

        return result;
    }
}
