import java.util.Scanner;

public class soal2 {
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

        System.out.println("Total nilai: " + total);
    }
}