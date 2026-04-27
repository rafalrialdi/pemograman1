import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nilai Mahasiswa");
        System.out.println("===========================================");
        System.out.print("Masukan nilai presensi : ");
        float presensi = input.nextFloat();

        System.out.print("Masukan nilai tugas : ");
        float tugas = input.nextFloat();

        System.out.print("Masukan nilai UTS : ");
        float uts = input.nextFloat();

        System.out.print("Masukan nilai UAS : ");
        float uas = input.nextFloat();

        float totalPresensi = presensi / 21 * 10;
        float totalTugas = tugas * 21 / 100;
        float totalUTS = uts * 30 / 100;
        float totalUAS = uas * 40 / 100;

        double total = totalPresensi + totalTugas + totalUTS + totalUAS;

        System.out.println("===========================================");
        System.out.printf("Total Nilai : %.2f\n", total);

        // IF ELSE GRADE
        if (total >= 80) {
            System.out.println("Grade : A");
        } else if (total >= 70) {
            System.out.println("Grade : B");
        } else if (total >= 60) {
            System.out.println("Grade : C");
        } else if (total >= 50) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : E");
        }

        input.close();
    }
}