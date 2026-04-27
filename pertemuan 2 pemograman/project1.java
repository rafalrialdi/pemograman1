import java.util.Scanner;

public class project1 {
    static String nama;
    static int usia;
    static String alamat;

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        project1.nama = input.nextLine();

        System.out.print("Masukkan usia: ");
        project1.usia = input.nextInt();
        input.nextLine(); // untuk membersihkan newline

        System.out.print("Masukkan alamat: ");
        project1.alamat = input.nextLine();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama    : " + project1.nama);
        System.out.println("Usia    : " + project1.usia);
        System.out.println("Alamat  : " + project1.alamat);

        input.close();
    }
}
