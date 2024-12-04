import java.util.Scanner;
public class sedang1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();
        long faktorial = 1;

        for (int i = bilangan; i >= 1; i--){
            System.out.print(i);
            if (i > 1) {
                System.out.print(" X ");
            }
            faktorial *= i;
        }
        System.out.println(" = " + faktorial);
    }
}