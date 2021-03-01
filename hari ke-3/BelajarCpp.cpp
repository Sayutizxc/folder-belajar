#include <iostream>

using namespace std;

/* 
  Jika ingin menuliskan fungsi dibawah fungsi main 
  maka kita harus membuat fungsi prototipe nya.
*/
void hallo();
void sapa(string nama);
int tambah(int bil1, int bil2);

int main() {
  // Memanggil fungsi hallo.
  hallo();

  // Memanggil fungsi sapa dengan argument
  sapa("C++");

  // Menambung hasil yang dikembalikan dari fungsi tambah
  int hasil = tambah(2,3);
  // Menampilkan hasilnya
  cout << hasil << endl;
  return 0;
}

// Membuat fungsi dengan tipe void (tidak mengembalikan nilai).
void hallo(){
  cout << "Hallo semuanya\n";
}

// Membuat fungsi dengan tipe void (tidak mengembalikan nilai) dengan parameter.
void sapa(string nama){
  cout << "Hai " << nama << endl;
}

// Membuat fungsi dengan parameter dan mengembalikan nilai dengan tipe integer.
int tambah(int bil1, int bil2){
  return bil1 + bil2;
}