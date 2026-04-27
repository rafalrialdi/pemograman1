import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0;
        int i = 1; // urutan nilai

        do {
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Nilai ke-" + i + " : ");
            int nilai = input.nextInt();

            total += nilai;

            System.out.println("Data: " + nama);
            System.out.println("Nilai ke-" + i + ": " + nilai);

            i++; // tambah urutan

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        // hitung rata-rata
        float rata = (float) total / (i - 1);

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-Rata: " + rata);
    }
}