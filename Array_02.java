import java.util.Scanner;

public class Array_02{
    public Array_02(){
    }
    public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);

      double  total = 0.0;

      String[][] hasilNilai = new String[][]{
         {"MK                                        ", "    Nilai Angka", "Nilai Huruf", "Bobot Nilai", "   SKS"}, 
         {"Critical Thingking and Problem Solving    ", "", "", "", ""}, 
         {"Dasar Pemrograman                         ", "", "", "", ""},
         {"Konsep Teknologi Informasi                ", "", "", "", ""}, 
         {"Matematika Dasar                          ", "", "", "", ""}, 
         {"Praktikum Dasar Pemrograman               ", "", "", "", ""}, 
         {"Pengantar Akuntansi,Manajemen, dan Bisnis ", "", "", "", ""}, 
         {"Agama                                     ", "", "", "", ""}, 
         {"Bahasa Indonesia                          ", "", "", "", ""}, 
         {"Bahasa Inggris Dasar                      ", "", "", "", ""}
      };

      System.out.println("================================");
      System.out.println("Program Menghitung IP Semester");
      System.out.println("================================");

      int i;
      for(i = 1; i < hasilNilai.length; ++i) {
         System.out.print("Masukkan nilai angka untuk MK " + hasilNilai[i][0] + ": ");
         switch (i) {
            case 1:
               double ctps = Scanner.nextDouble();
               if (ctps >= 0.0 && ctps <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(ctps);
                  hasilNilai[i][2] = nilaiHuruf(ctps);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(ctps));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(ctps) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  i--;
               }
               break;
            case 2:
               double daspro = Scanner.nextDouble();
               if (daspro >= 0.0 && daspro <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(daspro);
                  hasilNilai[i][2] = nilaiHuruf(daspro);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(daspro));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(daspro) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  i--;
               }
               break;
            case 3:
               double kti = Scanner.nextDouble();
               if (kti >= 0.0 && kti <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(kti);
                  hasilNilai[i][2] = nilaiHuruf(kti);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(kti));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(kti) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  i--;
               }
               break;
            case 4:
               double matdas = Scanner.nextDouble();
               if (matdas >= 0.0 && matdas <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(matdas);
                  hasilNilai[i][2] = nilaiHuruf(matdas);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(matdas));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(matdas) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  --i;
               }
               break;
            case 5:
               double prakdaspro = Scanner.nextDouble();
               if (prakdaspro >= 0.0 && prakdaspro <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(prakdaspro);
                  hasilNilai[i][2] = nilaiHuruf(prakdaspro);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(prakdaspro));
                  hasilNilai[i][4] = "3";
                  total += bobotNilai(prakdaspro) * 3.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  --i;
               }
               break;
            case 6:
               double pamb = Scanner.nextDouble();
               if (pamb >= 0.0 && pamb <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(pamb);
                  hasilNilai[i][2] = nilaiHuruf(pamb);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(pamb));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(pamb) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  --i;
               }
               break;
            case 7:
               double agama = Scanner.nextDouble();
               if (agama >= 0.0 && agama <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(agama);
                  hasilNilai[i][2] = nilaiHuruf(agama);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(agama));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(agama) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  --i;
               }
               break;
            case 8:
               double Bindo = Scanner.nextDouble();
               if (Bindo >= 0.0 && Bindo <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(Bindo);
                  hasilNilai[i][2] = nilaiHuruf(Bindo);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(Bindo));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(Bindo) * 2.0;
               }else {
                  System.out.println("Nilai tidak valid!");
                  --i;
               }
               break;
            case 9:
               double Bing = Scanner.nextDouble();
               if (Bing >= 0.0 && Bing <= 100.0) {
                  hasilNilai[i][1] = String.valueOf(Bing);
                  hasilNilai[i][2] = nilaiHuruf(Bing);
                  hasilNilai[i][3] = String.valueOf(bobotNilai(Bing));
                  hasilNilai[i][4] = "2";
                  total += bobotNilai(Bing) * 2.0;      
               } else{
                  System.out.println("Nilai tidak valid!");
                  --i;
               }
               break;
         }
      }

      System.out.println("================================");
      System.out.println("Hasil Konversi Nilai");
      System.out.println("================================");

      for(i = 0; i < hasilNilai.length; ++i) {
         for(int j = 0; j < hasilNilai[i].length; ++j) {
            if (i == 0) {
               System.out.print(hasilNilai[i][j] + "  ");
            } else {
               System.out.print(hasilNilai[i][j] + "          ");
            }
         }

         System.out.println();
      }

      double ip = total / 19.0;
      System.out.println("================================");
      System.out.println("IP Semester : " + Math.round(ip * 100.0) / 100.0);
      System.out.println("================================");
   }

   static String nilaiHuruf(double nilai) {
      if (nilai > 80.0 && nilai <= 100.0) {
         return "A ";
      } else if (nilai > 73.0 && nilai <= 80.0) {
         return "B+";
      } else if (nilai > 65.0 && nilai <= 73.0) {
         return "B ";
      } else if (nilai > 60.0 && nilai <= 65.0) {
         return "C+";
      } else if (nilai > 50.0 && nilai <= 60.0) {
         return "C ";
      } else {
         return nilai > 39.0 && nilai <= 50.0 ? "D " : "E ";
      }
   }

   static double bobotNilai(double nilai) {
      if (nilai > 80.0 && nilai <= 100.0) {
         return 4.0;
      } else if (nilai > 73.0 && nilai <= 80.0) {
         return 3.5;
      } else if (nilai > 65.0 && nilai <= 73.0) {
         return 3.0;
      } else if (nilai > 60.0 && nilai <= 65.0) {
         return 2.5;
      } else if (nilai > 50.0 && nilai <= 60.0) {
         return 2.0;
      } else {
         return nilai > 39.0 && nilai <= 50.0 ? 1.0 : 0.0;
      }
   }
}