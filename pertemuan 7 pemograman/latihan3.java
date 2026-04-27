import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int kehadiran, nilaiakhir;
        float presensi;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input nilai Kehadiran :");
        kehadiran = input.nextInt();

        System.out.print("Input nilai nilai akhir: ");
        nilaiakhir = input.nextInt();

        presensi = 21 * 75 / 100;

        System.out.println("\n Data Mahasiswa ");
        System.out.println("Nama  : " + nama);
        System.out.println("Kehadran : " + kehadiran);
        System.out.println("Nilai akhir : " + nilaiakhir);

        // IF UTAMA (kehadiran)
        if (kehadiran >= presensi) {

            // IF NILAI
            if (nilaiakhir >= 80) {
                System.out.println("NILAI  : A ");
            } else if (nilaiakhir >= 70) {
                System.out.println("NILAI  : B ");
            } else if (nilaiakhir >= 60) {
                System.out.println("NILAI  : C ");
            } else if (nilaiakhir >= 50) {
                System.out.println("NILAI  : D ");
            } else {
                System.out.println("NILAI  : E ");
            }

        } else {
            // Kalau kehadiran kurang
            System.out.println("NILAI : E");
        }

        input.close();
    }
}