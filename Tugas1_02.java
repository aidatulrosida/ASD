import java.util.Scanner;
public class Tugas1_02 {
    public static void main(String[] args) {
        // Array pertama: KODE
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array kedua: KOTA
        char[][] KOTA = {
                {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
                {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
                {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
                {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        String input = scanner.nextLine();
        char cekInput = input.charAt(0);

        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == cekInput) {
                System.out.println("Kota: " + String.valueOf(KOTA[i]));
                break;
            }
        }
    }
}