import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("nilai: ");
            int nilai = input.nextInt();

            System.out.println("Data: " + nama );
             System.out.println("Nilai: " + nilai);

            System.out.print("Ulangi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); // biar tidak error

        } while (ulang == 'y' || ulang == 'Y');
    }
}