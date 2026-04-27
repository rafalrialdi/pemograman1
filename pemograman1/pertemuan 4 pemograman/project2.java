import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, luas, keliling;

        System.out.println("Menghitung Lingkaran");
        System.out.println("===========================");
        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();

        // PROSES
        double phi = 3.14;
        luas = phi * r * r;
        keliling = 2 * phi * r;

        System.out.println("===========================");
        System.out.println("Proses Perhitungan:");
        System.out.println("Luas = phi x r x r");
        System.out.println("     = 3.14 x " + r + " x " + r);
        System.out.println("     = " + luas);

        System.out.println("\nKeliling = 2 x phi x r");
        System.out.println("         = 2 x 3.14 x " + r);
        System.out.println("         = " + keliling);

        input.close();
    }
}