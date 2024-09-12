import java.util.Scanner;

public class tugas2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int jmlJam;
        double gajiPerJam = 100000;

        System.out.print("Masukkan jam kerja: ");
        jmlJam = sc.nextInt();

        double totalGaji = (jmlJam * gajiPerJam);
        double gajiSblmPajak = totalGaji + ((totalGaji * 10)/100);
        double gajiStlhPajak = (gajiSblmPajak * 95)/100;

        System.out.println("Total Gaji : " + totalGaji);
        System.out.println("Gaji Setelah bonus : " + gajiSblmPajak);
        System.out.println("Gaji Setelah Pajak : " + gajiStlhPajak);

    }
}