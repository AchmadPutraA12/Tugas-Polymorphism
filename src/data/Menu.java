package data;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    data_barang dataBarang = new data_barang();

    public void menu(){
        String pilih;
        do {
            System.out.println("""          
                    1. Tambah Barang
                    2. Cari Barang Dengan Index
                    3. Tampilkan Semua Barang
                    4. Edit Nama Barang
                    5. Hapus
                    6. Keluar""");
            System.out.print("INPUT : ");
            pilih = input.nextLine();

            switch (pilih) {
                case "1" -> dataBarang.tambahBarang();
                case "2" -> dataBarang.lihatBarangByIndex();
                case "3" -> dataBarang.view();
                case "4" -> dataBarang.update();
                case "5" -> dataBarang.delete();
                case "6" -> dataBarang.exit();
                default -> dataBarang.warning();
            }
        }while(!pilih.equals("6"));
    }
}
