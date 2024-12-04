import java.util.Scanner;

public class sulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        System.out.println("Masukkan nilai: ");
        int[]array = new int[n];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        int[] sekali = new int[array.length];
        int[] berkalikali = new int[array.length];
        int indeksangka = 0;

        for (int i = 0; i < array.length; i++) {
            boolean golek = false;
            for (int j = 0; j < indeksangka; j++) {
                if (array[i] == sekali[j]) {
                    berkalikali[j]++;
                    golek = true;
                    break;
                }
            }
            if (!golek) {
                sekali[indeksangka] = array[i];
                berkalikali[indeksangka] = 1;
                indeksangka++;
            }
        }

        for (int i = 0; i < indeksangka; i++) {
            System.out.println(sekali[i] + " muncul " + berkalikali[i] + " kali");
        }
    }
}