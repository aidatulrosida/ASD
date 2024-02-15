import java.util.Scanner;

public class Tugas2_02 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        double v, s, t;

        do {
            System.out.println("=== Rumus Kecepatan, Jarak, dan Waktu ===");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.println("-----------------------------------------");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("-----------------------------------------");

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jarak (s): ");
                    s = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = scanner.nextDouble();
                    v = s / t;
                    System.out.printf("Kecepatan: %.2f\n\n", v);
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (v): ");
                    v = scanner.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = scanner.nextDouble();
                    s = v * t;
                    System.out.printf("Jarak: %.2f\n\n", s);
                    break;
                case 3:
                    System.out.print("Masukkan jarak (s): ");
                    s = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (v): ");
                    v = scanner.nextDouble();
                    t = s / v;
                    System.out.printf("Waktu: %.2f\n\n", t);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.out.println("=========================================");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}