import java.util.Scanner;
public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array untuk kode barang, nama barang, dan harga barang
        String[] kodeBarang = {"001", "002", "003", "004", "005"};
        String[] namaBarang = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
        int[] hargaBarang = {5000, 6000, 3500, 10000, 2500};

        // Array untuk menyimpan jumlah barang yang dibeli & jumlah total bayar untuk setiap barang yang sudah dpilih
        int[] jumlahBeli = new int[5];
        int[] jumlahBayar = new int[5];

        // Output judul program
        System.out.println("\t\t\tTOKO SERBA ADA");
        System.out.println("***************************************************************");

        // Input jumlah item yang ingin dibeli dari pengguna
        System.out.print("Masukkan Item Barang : ");
        int jumlahItem = input.nextInt(); // Input jumlah item yang dibeli

        // Loop untuk memasukkan kode barang dan jumlah beli sebanyak jumlah item yang dibeli
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));

            // Input kode barang dari pengguna
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.next();
            
            // Input jumlah barang yang dibeli dari pengguna
            System.out.print("Masukkan jumlah Beli : ");
            int beli = input.nextInt();
            
            // Loop untuk mencari barang berdasarkan kode dan menghitung jumlah bayar
            for (int j = 0; j < kodeBarang.length; j++) {
                // Jika kode barang cocok, simpan jumlah beli dan hitung jumlah bayar (harga * jumlah)
                if (kodeBarang[j].equals(kode)) {
                    jumlahBeli[j] = beli;
                    jumlahBayar[j] = hargaBarang[j] * beli;
                }
            }
        }

        // Output tabel hasil pembelian
        System.out.println("\n\t\t\tTOKO SERBA ADA");
        System.out.println("***************************************************************");
        System.out.println("No  Kode Barang   Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        
        int totalBayar = 0; //  Variabel untuk menghitung total bayar yang sudah dibeli
        int no = 1; // Untuk nomor urut barang yang ingin dibeli
        
        // Loop untuk menampilkan barang-barang yang dibeli
        for (int i = 0; i < kodeBarang.length; i++) {
            if (jumlahBeli[i] > 0) {
                System.out.printf("%-5d%-14s%-13s%-10d%-12d%-14d\n", 
                        no, kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
                no++; // Nomor urut ditambah
                totalBayar += jumlahBayar[i]; // Menambahkan jumlah bayar ke total
            }
        }
        
        // Output total bayar dari seluruh barang yang dibeli
        System.out.println("===============================================================");
        System.out.println("Total Bayar \t \t \t \t \t" + totalBayar);
        System.out.println("===============================================================");
    }
}
