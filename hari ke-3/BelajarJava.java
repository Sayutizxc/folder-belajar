public class BelajarJava {
    public static void main(String[] args) {
        // Memanggil fungsi hallo.
        hallo();

        // Memanggil fungsi sapa dengan menambahkan argumen
        sapa("Java");

        // Menambung hasil yang dikembalikan dari fungsi tambah
        int hasil = tambah(2,3);
        // Menampilkan hasilnya
        System.out.println(hasil);
    }

    // Membuat fungsi dengan tipe void (tidak mengembalikan nilai).
    public static void hallo(){
        System.out.println("Hallo semuanya");
    }

    // Membuat fungsi dengan tipe void (tidak mengembalikan nilai) dengan parameter.
    public static  void sapa(String nama){
        System.out.println("Hai "+ nama);
    }

    // Membuat fungsi dengan parameter dan mengembalikan nilai dengan tipe integer.
    public static  int tambah(int bil1, int bil2){
        return bil1 + bil2;
    }
}