import java.util.Scanner;;
public class sulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahsiswa, nilai, jumlahnilai = 0;

        System.out.println("Masukkan jumlah siswa: ");
        jumlahsiswa = input.nextInt();

        for (int i = 1; i <= jumlahsiswa; i++){
            System.out.println("Masukkan nilai siswa " + i + ":");
            nilai = input.nextInt();
            jumlahnilai += nilai;
        }
        double hasil = (double) jumlahnilai / jumlahsiswa;
        System.out.println("RATA RATA: " + hasil);
    }
}

