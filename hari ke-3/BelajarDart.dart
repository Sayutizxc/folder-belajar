void main() {
  // Memanggil fungsi hallo.
  hallo();

  // Memanggil fungsi sapa dengan menambahkan argumen
  sapa("Dart");

  // Menambung hasil yang dikembalikan dari fungsi tambah
  int hasil = tambah(2,3);
  // Menampilkan hasilnya
  print(hasil);
}

// Membuat fungsi dengan tipe void (tidak mengembalikan nilai).
void hallo(){
  print("Hallo semuanya");
}

// Membuat fungsi dengan tipe void (tidak mengembalikan nilai) dengan parameter.
void sapa(String nama){
  print("Hai $nama");
}

// Membuat fungsi dengan parameter dan mengembalikan nilai dengan tipe integer.
int tambah(int bil1, int bil2){
  return bil1 + bil2;
}