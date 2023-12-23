package project.akhir;
import java.util.Scanner;
public class ProjectAkhir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean kembali;
        String film = "";
        int hargakamar = 0;
        String kamar1 = "";
        String jadwal1 = "";
        String pukul1 = "";
        int totalhargasnack = 0;
        String snackdetail = "";
        String snack1 = "";   
        String[][] menu = {
            {"Milk Tea", "Mie Goreng", "Ayam Kremes"},
            {"Es Teh", "Es Jeruk", "Kopi"}
        };
        int[][] harga = {
            {9000, 12000, 20000},
            {5000, 6000, 8000}
        };
        int[][] keranjang = new int[2][3];   
        System.out.println("============================================================================================= ");
        System.out.println("||                                                                                         ||");
        System.out.println("||        _______________             ____      _____             _______________          ||");
        System.out.println("||      //---------------\\\\         //    \\    /     \\\\         //---------------\\\\        ||");
        System.out.println("||     //                 \\\\       //      \\  /       \\\\       //                 \\\\       ||");
        System.out.println("||    //___________________\\\\     ||        \\/         ||     //___________________\\\\      ||");
        System.out.println("||   //|                   |\\\\     \\\\                 //     //|                   |\\\\     ||");
        System.out.println("||     |                   |        \\\\     RUMKOP    //        |                   |       ||");
        System.out.println("||     |     WELCOME TO    |=========\\(RUMAH BIOSKOP)==========|  sejak 1987       |       ||");
        System.out.println("||     |                   |== == ==  \\\\           //  == == ==|                   |       ||");
        System.out.println("||     |___________________|===========\\\\         //===========|___________________|       ||");
        System.out.println("||      ++                       +     \\\\       //        +       ++        +  +  +++      ||");
        System.out.println("||    +     +++    +   ++    +          +\\\\     //   + ++    + +++ +++    +    +           ||");
        System.out.println("||       ++      +    ++++      ++        \\\\   // +    +   +    ++      +++         + +    ||");
        System.out.println("||       +             ++        ++     +  \\\\ // +       ++ + +     ++      +++ +++++ +    ||");
        System.out.println("||                                                                                         ||");
        System.out.println("||                                                                                         || ");
        System.out.println("===========================================================================================||");
        System.out.println("");
        System.out.println("");
        
        System.out.println("-----------Data Diri-----------");
        System.out.print("Masukkan Nama        = ");
        String nama = s.next();
        System.out.print("Masukkan No Telepon  = ");
        String no = s.next();
do{
    kembali = false;
        System.out.println("");
        System.out.println("");
        System.out.println("Halo " + nama + " selamat datang di RumKop, kami buka setiap hari dari pukul 10.00-21.00");
        System.out.println("-------Mau Ngapain Hari Ini-------");
        System.out.println("1. Mau nonton ajah\n2. Nongkrong sabi nih");
        System.out.println("");
        System.out.print("Masukkan Pilihanmu : ");
        int milih = s.nextInt();
        System.out.println("");

        switch (milih) {
            case 1:
                do {
                    kembali = false;
                    System.out.println("Tersedia 5 film pada hari ini");
                    System.out.println("----------Daftar Film----------");
                    System.out.println("|  1. Fight Club               |");
                    System.out.println("|  2. Berserk                  |");
                    System.out.println("|  3. The Climber              |");
                    System.out.println("|  4. Vinland Saga             |");
                    System.out.println("|  5. The Wolf of Wall Street  |");
                    System.out.println("================================");
                    System.out.print("Masukkan Pilihan Anda = ");
                    int pilihan = s.nextInt();
                    System.out.println("");
                    System.out.println("");
                    switch (pilihan) {
                        case 1:
                            film = "Fight Club (1999)";
                            System.out.println("                                        Fight Club (1999)");
                            System.out.println("======================================================================================================");
                            System.out.println("  Fight Club adalah film thriller psikologis tahun 1999 yang disutradarai oleh David Fincher ditulis  ");
                            System.out.println("  oleh Jim Uhls. Film  ini dibintangi oleh  Edward Norton, Brad Pitt, dan Helena Bonham Carter. Film  ");
                            System.out.println("  ini mengisahkan  tentang seorang pekerja kantoran yang terjebak  dalam kehidupan yang  membosankan  ");
                            System.out.println("  dan tanpa tujuan. Dia bertemu dengan seorang pria misterius bernama Tyler Durden (Pitt),dan mereka  ");
                            System.out.println("  membentuk  sebuah  klub  pertarungan  ilegal. Klub  ini menjadi wadah bagi  orang-orang yang ingin  ");
                            System.out.println("  melepaskan diri dari tekanan kehidupan modern. ");
                            System.out.println("======================================================================================================");
                            System.out.println("(1. Lanjutkan / 2. Kembali ke menu utama)");
                            System.out.print("Masukkan Pillihanmu : ");
                            int pilihan1 = s.nextInt();
                            switch (pilihan1) {
                                case 1:
                                    break;
                                case 2:
                                    System.out.println("");
                                    kembali = true;
                                    System.out.println("");
                                    break;
                                default :
                                    kembali =true;
                                    System.out.println("");
                                    System.out.println("Pilihan Anda Tidak Valid");
                                    System.out.println("");
                            }
                            break;
                        case 2:
                            film = "Berserk (1988)";
                            System.out.println("                                                Berserk (1988)");
                            System.out.println("=================================================================================================================");
                            System.out.println("  Berserk adalah dark fantasy yang mengikuti perjalanan Guts, seorang prajurit bayaran dengan masa lalu sulit.");
                            System.out.println("  Cerita memulai  dengan kehidupan Guts,  menggali trauma masa  kecil, keterlibatan dalam  konflik brutal, dan");
                            System.out.println("  pertemuannya  dengan  Griffith, pemimpin Band of the  Hawk. Konflik pusat  melibatkan hubungan  rumit  Guts ");
                            System.out.println("  dan Griffith, serta  dampak keputusan mereka. Dengan unsur  supernatural dan kegelapan,  film ini  terkenal ");
                            System.out.println("  karena kekerasan, kompleksitas moral, dan ilustrasi  mendetail. Berserk dianggap sebagai karya terbaik dalam");
                            System.out.println("  dark fantasy dan seinen film, dengan catatan konten dewasa.");
                            System.out.println("=================================================================================================================");
                            System.out.println("(1. Lanjutkan / 2. Kembali ke menu utama)");
                            System.out.print("Masukkan Pillihanmu : ");
                            int pilihan2 = s.nextInt();
                            switch (pilihan2) {
                                case 1:
                                    break;
                                case 2:
                                    System.out.println("");
                                    kembali = true;
                                    System.out.println("");
                                    break;
                                default :
                                    kembali =true;
                                    System.out.println("");
                                    System.out.println("Pilihan Anda Tidak Valid");
                                    System.out.println("");
                            }
                            break;
                        case 3:
                            film = "The Climber (2007)";
                            System.out.println("                                                The Climber (2007)");
                            System.out.println("====================================================================================================================");
                            System.out.println("  Kokou no Hito mengikuti kisah Mori Buntarou, seorang pemuda misterius dengan obsesi mendaki gunung yang ekstrem.");
                            System.out.println("  Cerita mencerminkan  perjalanan hidupnya dari masa  sekolah hingga dewasa, menyoroti perjuangannya dalam mencari");
                            System.out.println("  makna hidup dan kebebasan  melalui kesendirian dan tantangan di pegunungan. Manga ini tidak hanya mengeksplorasi");
                            System.out.println("  dimensi fisik mendaki, tetapi juga aspek  psikologis  karakter utama, menciptakan  narasi yang mendalam  tentang");
                            System.out.println("  hubungan manusia dengan alam dan kompleksitas emosi di bawah tekanan. Kokou no Hito  dikenal karena penggambaran");
                            System.out.println("  visual yang kuat dan realistis terhadap kegiatan mendaki gunung.");
                            System.out.println("====================================================================================================================");
                            System.out.println("(1. Lanjutkan / 2. Kembali ke menu utama)");
                            System.out.print("Masukkan Pillihanmu : ");
                            int pilihan3 = s.nextInt();
                            switch (pilihan3) {
                                case 1:
                                    break;
                                case 2:
                                    System.out.println("");
                                    kembali = true;
                                    System.out.println("");
                                    break;
                                default :
                                    kembali =true;
                                    System.out.println("");
                                    System.out.println("Pilihan Anda Tidak Valid");
                                    System.out.println("");
                            }
                            break;
                        case 4:
                            film = "Vinland Saga (2018)";
                            System.out.println("                                                        Vinland Saga (2018)");
                            System.out.println("==========================================================================================================================================");
                            System.out.println("  Vinland Saga mengisahkan  perjalanan Thorfinn, seorang  pemuda Viking yang  mencari balas dendam  terhadap pembunuh ayahnya, Askeladd.");
                            System.out.println("  Berlatar  di era Viking  pada abad  ke-11, cerita ini  memperlihatkan konflik  politik dan pertempuran  yang melibatkan bangsa  Viking");
                            System.out.println("  dan kerajaan - kerajaan lainnya. Melalui  perjalanannya, Thorfinn  mengalami perubahan moral dan mencari makna  hidupnya. Vinland Saga");
                            System.out.println("  Vinland, sebuah tempat yang dianggap sebagai surga, serta mendalami dinamika karakter dan dampak konflik pada jiwa-jiwa yang terlibat.");
                            System.out.println("  mengeksplorasi tema penemuan  Dikenal dengan seni yang indah dan pertempuran realistis, manga ini menyajikan kisah epik yang mengombi-");
                            System.out.println("  nasikan petualangan, sejarah, dan pertimbangan filosofis.");
                            System.out.println("==========================================================================================================================================");
                            System.out.println("(1. Lanjutkan / 2. Kembali ke menu utama)");
                            System.out.print("Masukkan Pillihanmu :");
                            int pilihan4 = s.nextInt();
                            switch (pilihan4) {
                                case 1:
                                    break;
                                case 2:System.out.println("");
                                    kembali=true;
                                    System.out.println("");
                                    break;
                                default :
                                    kembali =true;
                                    System.out.println("");
                                    System.out.println("Pilihan Anda Tidak Valid");
                                    System.out.println("");
                            }
                            break;
                        case 5:
                            film = "The Wolf of Wall Street (2013)";
                            System.out.println("                                           The Wolf of Wall Street (2013)");
                            System.out.println("=========================================================================================================================");
                            System.out.println("  The Wolf of Wall Street  adalah film yang di sutradarai oleh  Martin Scorsese dan  dibintangi oleh Leonardo DiCaprio.");
                            System.out.println("  berdasarkan memoar Jordan Belfort, seorang pialang saham yang terlibat dalam kegiatan keuangan ilegal di Wall Street.");
                            System.out.println("  Film ini menampilkan  kehidupan glamor, kegilaan,  dan moralitas yang merusak. DiCaprio memainkan peran utama sebagai");
                            System.out.println("  Belfort, yang menjelajahi kekayaan dan kemewahan melalui penipuan  dan kecurangan.  Film ini menciptakan  gambar yang");
                            System.out.println("  kontroversial dan menghadirkan penggambaran yang intens tentang dunia keuangan yang penuh intrik dan kelebihan.");
                            System.out.println("=========================================================================================================================");
                            System.out.println("(1. Lanjutkan / 2. Kembali ke menu utama)");
                            System.out.print("Masukkan Pillihanmu : ");
                            int pilihan5 = s.nextInt();
                            switch (pilihan5) {
                                case 1:
                                    break;
                                case 2:System.out.println("");
                                    kembali = true;
                                    System.out.println("");
                                    break;
                                default : 
                                    System.out.println("");
                                    System.out.println("Pilihan Anda Tidak Valid");
                                    System.out.println("");
                                    kembali = true;
                            }
                            break;
                        default:
                            System.out.println("Pilihan Anda tidak valid");
                            kembali = true;
                    }
                } while (kembali);
      
               do{ 
                   kembali = false;
                System.out.println("");
                System.out.println("");
                System.out.println("Berikut ini adalah pilihan kamar yang tersedia untuk anda");
                System.out.println("---------------------PILIHAN KAMAR--------------------");
                System.out.println("| 1. Kamar Standar     Rp. 50.000/film  max 4 orang  |");
                System.out.println("| 2. Kamar Keluarga    Rp. 75.000/film  max 7 orang  |");
                System.out.println("| 3. Kamar Deluxe      Rp. 110.000/film max 12 orang |");
                System.out.println("______________________________________________________");
                System.out.print("Masukkan Pilihan Anda : ");
                int kamar = s.nextInt();
                switch (kamar) {
                    case 1:
                        kamar1 = "Kamar Standar";
                        hargakamar = 50000;
                        break;
                    case 2:
                        kamar1 = "Kamar Keluarga";
                        hargakamar = 75000;
                        break;
                    case 3:
                        kamar1 = "Kamar Deluxe";
                        hargakamar = 110000;
                        break;
                    default:
                        System.out.println("");
                        kembali = true;
                        System.out.println("Pilihan Anda Tidak Valid");
                        System.out.println("");
                        break;
                } 
               } while(kembali);
               
              do{ 
                  kembali =false;
                System.out.println("");
                System.out.println("");
                System.out.println("Pilih Jadwal");
                System.out.println("--------------------------(HARI)------------------------");
                System.out.println("     1. <Senin>        4. <Kamis>        7. <Minggu>");
                System.out.println("     2. <Selasa>       5. <Jumat>");
                System.out.println("     3. <Rabu>         6. <Sabtu>");
                System.out.println("--------------------------------------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                int jadwal = s.nextInt();
                switch (jadwal) {
                    case 1:
                        jadwal1 = "Senin";
                        break;
                    case 2:
                        jadwal1 = "Selasa";
                        break;
                    case 3:
                        jadwal1 = "Rabu";
                        break;
                    case 4:
                        jadwal1 = "Kamis";
                        break;
                    case 5:
                        jadwal1 = "Jumat";
                        break;
                    case 6:
                        jadwal1 = "Sabtu";
                        break;
                    case 7:
                        jadwal1 = "Minggu";
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Pilihan Tidak Valid");
                        System.out.println("");
                        kembali = true;
                }
              } while(kembali);
              do{
                  kembali=false;
                System.out.println("---------------------------(PUKUL)----------------------");
                System.out.println("                     1. 10.00 - 12.00");
                System.out.println("                     2. 13.00 - 15.00");
                System.out.println("                     3. 16.00 - 18.00");
                System.out.println("                     4. 19.00 - 21.00");
                System.out.println("---------------------------------------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                int pukul = s.nextInt();
                switch (pukul) {
                    case 1:
                        pukul1 = "10.00 - 12.00";
                        break;
                    case 2:
                        pukul1 = "13.00 - 15.00";
                        break;
                    case 3:
                        pukul1 = "16.00 - 18.00";
                        break;
                    case 4:
                        pukul1 = "19.00 - 21.00";
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Pilihan Anda Tidak Valid");
                        System.out.println("");
                        kembali = true;
                }
              }while (kembali);
              
                while (true) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Nikmati pengalaman menonton Anda dengan snack pilihan kami");
                    System.out.println("-----------------------(SNACK)-------------------");
                    System.out.println("               1. Popcorn - Rp. 20.000");
                    System.out.println("               2. Nachos  - Rp. 15.000");
                    System.out.println("               3. Soda    - Rp. 10.000");
                    System.out.println("               4. Next");
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int hargasnack = 0;
                    int snack = s.nextInt();
                    if (snack == 4) {
                        break;
                    }
                    if (snack < 1 || snack > 3) { 
                        System.out.println("Pilihan Anda Tidak Valid");
                        continue;  }
    
                    System.out.print("Masukkan Jumlah : ");
                    int jumlahsnack = s.nextInt();
                    switch (snack) {
                        case 1:
                            snack1 = "Popcorn";
                            hargasnack = 20000;
                            break;
                        case 2:
                            snack1 = "Nachos";
                            hargasnack = 15000;
                            break;
                        case 3:
                            snack1 = "Soda";
                            hargasnack = 10000;
                            break;
                        default:
                            System.out.println("Pilihan Anda Tidak Valid");
                            continue;
                    }
                    snackdetail += snack1 + " x " + jumlahsnack + ", ";
                    totalhargasnack += hargasnack * jumlahsnack;
                }
                int total1 = hargakamar + totalhargasnack;
                if(!snackdetail.isEmpty()) {
                System.out.println("");
                System.out.println("");
                System.out.println("KONFIRMASI TOTAL HARGA");
                System.out.println("===============================");
                System.out.println("Atas Nama   = " + nama);
                System.out.println("===============================");
                System.out.println("No Telepon  = " + no);
                System.out.println("===============================");
                System.out.println("Hari        = " + jadwal1);
                System.out.println("Pukul       = " + pukul1);
                System.out.println("Tahun       = 2023");
                System.out.println("===============================");
                System.out.println("Jenis Kamar = " + kamar1);
                System.out.println("Harga Kamar = " + hargakamar);
                System.out.println("===============================");
                System.out.println("Snack       = " + snackdetail.substring(0, snackdetail.length() - 2));
                System.out.println("Total Snack = " + totalhargasnack);
                System.out.println("===============================");
                System.out.println("TOTAL HARGA = " + total1);
                System.out.println("-------------------------------");
                } else { 
                System.out.println("");
                System.out.println("");
                System.out.println("KONFIRMASI TOTAL HARGA");
                System.out.println("===============================");
                System.out.println("Atas Nama   = " + nama);
                System.out.println("===============================");
                System.out.println("No Telepon  = " + no);
                System.out.println("===============================");
                System.out.println("Hari        = " + jadwal1);
                System.out.println("Pukul       = " + pukul1);
                System.out.println("Tahun       = 2023");
                System.out.println("===============================");
                System.out.println("Jenis Kamar = " + kamar1);
                System.out.println("Harga Kamar = " + hargakamar);
                System.out.println("===============================");
                System.out.println("TOTAL HARGA = " + total1);
                System.out.println("-------------------------------");
              }
                do{
                    kembali = false;
                System.out.println("Apakah anda ingin melanjutkan pesanan ini? ( 1. Ya / 2. Kembali ke halaman awal )");
                System.out.print("Masukkan Pilihan Anda : ");
                int kembaliawal = s.nextInt();           
                switch (kembaliawal){
                    case 1 :
                        break;
                    case 2 :
                        kembali = true;
                        break;
                    default :
                        System.out.println("");
                        System.out.println("Pilihan Anda Tidak Valid");
                        kembali=true;
                }
                }while(kembali); 
                break;
                
            case 2:        
        do {
            kembali = false;
            System.out.println("");
            System.out.println("Selamat datang "+nama+" di Cafe RumKop");
            System.out.println("");
            System.out.println("-----------Menu Utama-----------");
            System.out.println(" | 1. Pesan Menu              |");
            System.out.println(" | 2. Lihat Keranjang Pesanan |");
            System.out.println(" | 3. Check Out               |");
            System.out.println(" ------------------------------");
            System.out.println("");
            System.out.print("Masukkan pilihan Anda : ");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("");
                    System.out.println("----Daftar Menu----");
                    System.out.println("");
                    for (int kategori = 0; kategori < menu.length; kategori++) {
                        System.out.println("Kategori " + (kategori + 1) + ":");
                        for (int i = 0; i < menu[kategori].length; i++) {
                            System.out.println((i + 1) + ". " + menu[kategori][i] + " - Rp" + harga[kategori][i]);
                        }
                        System.out.println("");
                    }
                    
                    System.out.print("Masukkan kategori (1/2): ");
                    int kategori = s.nextInt() - 1;

                    System.out.print("Masukkan nomor menu: ");
                    int nomorMenu = s.nextInt() - 1;

                    System.out.print("Masukkan jumlah pesanan: ");
                    int jumlahPesanan = s.nextInt();

                    keranjang[kategori][nomorMenu] += jumlahPesanan;
                    System.out.println("");
                    System.out.print("Terimah kasih tekan apa saja untuk melihat keranjang pesanan anda : ");
                      String aneh = s.next();
                      switch (aneh){    
                          
                      }
                   
                case 2:

                        System.out.println("");
                        System.out.println("Keranjang Pesanan : ");
                        System.out.println("");
                        System.out.println("Kategori 1:");

                        for (int i = 0; i < menu[0].length; i++) {
                            System.out.println((i + 1) + ". " + menu[0][i] + " - Rp" + harga[0][i] + " (Jumlah Pesanan: "
                                    + keranjang[0][i] + ")");
                        }

                        System.out.println("");
                        System.out.println("Kategori 2:");

                 
                        for (int i = 0; i < menu[1].length; i++) { 
                            System.out.println((i + 1) + ". " + menu[1][i] + " - Rp" + harga[1][i] + " (Jumlah Pesanan: "
                                    + keranjang[1][i] + ")");
                        }

                        System.out.println("");

                        System.out.print("Tekan apa saja untuk kembali : ");
                        String lanjutKeranjang = s.next();

                        switch (lanjutKeranjang) {
                            default:
                                System.out.println("");
                                System.out.println("Pilihan Anda Tidak Valid");
                                System.out.println("");
                                kembali = true;
                        } break;
            
                
            case 3 :
                System.out.println("");
                System.out.println("");
                System.out.println("KONFIRMASI TOTAL HARGA");
                System.out.println("===============================");
                System.out.println("Atas Nama   = " + nama);
                System.out.println("===============================");
                System.out.println("No Telepon  = " + no);
                System.out.println("===============================");
                
             int totalHarga = 0;
            for (kategori = 0; kategori < menu.length; kategori++) {
        for (int i = 0; i < keranjang[kategori].length; i++) {
        totalHarga += keranjang[kategori][i] * harga[kategori][i];
        }
            }
                System.out.println("TOTAL HARGA = " + totalHarga );
                System.out.println("-------------------------------");
                System.out.println("Apakah anda ingin melanjutkan pesanan ( 1. Ya / 2. Kembali )");
                System.out.print("Masukkan Pilihan Anda : ");
                int makankembali = s.nextInt();
                switch (makankembali) {
                    case 1 : 
                        break;
                    case 2 :
                        kembali = true;
                        break;
                    default :
                        System.out.println("Pilihan Anda Tidak Valid");
                }
                break;
            default :
                kembali = true;
                break;
                 }
            }while (kembali);
        
            default : 
                System.out.println("Pilih diantara 2 itu ya...");
                break;
                
     }  break;  
}while (kembali) ;

            do{ 
                kembali=false;
                System.out.println("");
                System.out.println("---Pilih Metode Pembayaran---");
                System.out.println("   1. Kartu Kredit");
                System.out.println("   2. Transfer Bank");
                System.out.println("   3. Bayar Di Tempat");
                System.out.println("-----------------------------");
                System.out.print("Masukkan Pilihan Anda : ");
                int bank = s.nextInt();
                switch (bank) {
                    case 1:
                        System.out.println("1. Cicilan 3x");
                        System.out.println("2. Cicilan 6x");
                        System.out.println("3. Cicilan 12x");
                        System.out.println("");
                        System.out.print("Masukkan Pilihan Anda : ");
                        int kredit = s.nextInt();
                        switch (kredit){
                            case 1 :
                                System.out.print("Masukkan No Rekening :");
                                int kredit1 = s.nextInt();
                                System.out.print("Masukkan Pin : ");
                                int kredit2 = s.nextInt();
                                break;
                            case 2 :
                                System.out.print("Masukkan No Rekening :");
                                int kredit3 = s.nextInt();
                                System.out.print("Masukkan Pin : ");
                                int kredit4 = s.nextInt();
                                break;
                            case 3 :
                                System.out.print("Masukkan No Rekening :");
                                int kredit5 = s.nextInt();
                                System.out.print("Masukkan Pin : ");
                                int kredit6 = s.nextInt();
                                break;
                            default :System.out.println("");
                                System.out.println("Pilihan Anda Tidak Valid");
                                System.out.println("");
                                kembali =true;
                        }
                        break;
                    case 2 :
                        System.out.print("Masukkan No Rekening :");
                        int bank1 = s.nextInt();
                        System.out.print("Masukkan Pin : ");
                        int bank2 = s.nextInt();
                        break;
                    case 3 : 
                        break;
                    default:System.out.println("");
                        System.out.println("Pilihan Anda Tidak Valid");
                        System.out.println("");
                        kembali = true;
                }
            }while(kembali);
                System.out.println("");
                System.out.println("");
                System.out.println("-----Pembayaran Anda Berhasil-----");
        } 

    }

