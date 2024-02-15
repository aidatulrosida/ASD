import java.util.Scanner; 
 
public class Fungsi_02 { 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("=========================================="); 
        System.out.println("PROGRAM PERHITUNGAN PENDAPATAN ROYALGARDEN"); 
        System.out.println("=========================================="); 
 
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"}; 
        int[][] stokBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}}; 
        int[] hargaBunga = {75000, 50000, 60000, 10000}; 
        int[] penguranganStok = {-1, -2, 0, -5}; 
 
        int[] pendapatanCabang = new int[namaCabang.length]; 
        for (int i = 0; i < namaCabang.length; i++) { 
            for (int j = 0; j < stokBunga[i].length; j++) { 
                pendapatanCabang[i] += stokBunga[i][j] * hargaBunga[j]; 
            } 
        } 
 
        System.out.println("|   Cabang   |    Pendapatan     (Rp)    |"); 
        System.out.println("|------------|---------------------------|"); 
        for (int i = 0; i < namaCabang.length; i++) { 
            System.out.printf("| %s | %d |\n", namaCabang[i], pendapatanCabang[i]); 
        } 
 
        int pendapatanTotal = 0; 
        for (int pendapatan : pendapatanCabang) { 
            pendapatanTotal += pendapatan; 
        } 
 
        System.out.println("=========================================="); 
        System.out.println("Total Pendapatan: Rp" + pendapatanTotal); 
        System.out.println("=========================================="); 
        System.out.println(""); 
        System.out.println("Jumlah stock setiap jenis bunga  cabang RoyalGarden 4 :"); 
        System.out.println(""); 
        for (int i = 0; i < stokBunga[3].length; i++) { 
            int jumlahStok = stokBunga[3][i] + penguranganStok[i]; 
            System.out.println("Bunga ke-" + (i + 1) + ": " + jumlahStok); 
        } 
        System.out.println(""); 
    } 
     
}