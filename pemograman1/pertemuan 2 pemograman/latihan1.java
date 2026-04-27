import java.util.Scanner;

public class latihan1 {
    static String nama;
    static int usia;
    static String tempatTinggal; // tanpa spasi

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input nama: ");
        latihan1.nama = input.nextLine();

        System.out.print("Input usia: ");
        latihan1.usia = input.nextInt();
        input.nextLine();

         System.out.print("Input tempat tinggal: ");
        latihan1.tempatTinggal = input.nextLine();

        
        System.out.println("\nData Anda:");
        System.out.println("Nama: " + latihan1.nama);
        System.out.println("Usia: " + latihan1.usia);
        System.out.println("Tempat tinggal: " + latihan1.tempatTinggal);

        input.close();
    }
}