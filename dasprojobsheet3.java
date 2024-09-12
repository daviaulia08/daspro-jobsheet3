import java.util.Scanner;

public class dasprojobsheet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = sc.nextInt();

        double totalHarga = (jmlKopi * hargaKopi + jmlTeh * hargaTeh + jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga;
        double nominalBayar = totalHarga - (diskon * totalHarga); 
        int nominalInt = (int) nominalBayar;
    
        System.out.println("Keanggotaan pelanggaan" + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + "kopi," + jmlTeh + "teh," + jmlRoti + "roti,");
        System.out.println("Nominal bayar rp: " + nominalBayar);
    }
}