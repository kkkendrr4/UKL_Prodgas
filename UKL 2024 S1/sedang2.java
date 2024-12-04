import java.util.Random;
import java.util.Scanner;

public class sedang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean lanjut = true;

        while (lanjut) {
            int bilangan1 = random.nextInt(10) + 1;
            int bilangan2 = random.nextInt(10) + 1;
            char operator = operasirandom();
            int jawabanBenar = hitung(bilangan1, bilangan2, operator);

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            int jawabanUser = scanner.nextInt();

            cek(jawabanUser, jawabanBenar);

            System.out.print("Ingin melanjutkan? (1. yes / 2. no): ");
            int pilihan = scanner.nextInt();
            if (pilihan == 2) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah bermain!");
    }

    public static char operasirandom() {
        Random random = new Random();
        int operatorInt = random.nextInt(5);
        if (operatorInt == 0) {
            return '*';
        } else if (operatorInt == 1) {
            return '/';
        }else if (operatorInt == 2){
            return '+';
        } else if (operatorInt == 4){
            return '-';
        } else {
            return '%';
        }
    }

    public static int hitung(int bilangan1, int bilangan2, char operator) {
        Random random = new Random();
        switch (operator) {
            case '*':
                return bilangan1 * bilangan2;
            case '+':
                return bilangan1 + bilangan2;
            case '-':
                return bilangan1 - bilangan2;
            case '/':
                while (bilangan2 == 0) {
                    bilangan2 = random.nextInt(10) + 1;
                }
                return bilangan1 / bilangan2;
            case '%':
                return bilangan1 % bilangan2;
            default:
                return 0; 
        }
    }

    public static void cek(int jawabanUser, int jawabanBenar) {
        if (jawabanUser == jawabanBenar) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
        }
    }
}