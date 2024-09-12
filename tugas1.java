import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        int tarifkwh = 1500;
        int batasPenggunaan = 500;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        double penggunaanKwh = scanner.nextDouble();

        double totalTagihan = penggunaanKwh * tarifkwh;

        boolean melebihiBatas = penggunaanKwh > batasPenggunaan;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println(
        "Penggunaan listrik " + (melebihiBatas ? "melebihi 500 kWh." : "tidak melebihi 500 kWh.")
        );

        scanner.close();
    }
}