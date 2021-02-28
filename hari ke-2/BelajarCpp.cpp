#include <iostream>

using namespace std;

int main() {
  // Deklarasi variable
  // Gunakan const jika nilai dari variabel tidak berubah-ubah
  string namaBuah = "apel";
  int jumlahBuah = 5;
  cout << "Itu adalah buah " << namaBuah << " dan jumlahnya ada " << jumlahBuah << endl;

  // User input
  cout << "Masukkan nama buah : ";
  cin >> namaBuah;
  cout << "Masukkan jumlah buah : ";
  cin >> jumlahBuah;
  cout << "Itu adalah buah " << namaBuah << " dan jumlahnya ada " << jumlahBuah << endl;
  cout << "--------------------------------" << endl;
  
  // for
  for (int i = 0; i < 5; i++) {
    cout << "[for] >> Nilai [i] => " << i << endl;
  }
  cout << "--------------------------------" << endl;

  // while
  int x = 0;
  while (x < 5) {
    cout << "[while] >> Nilai [x] => " << x << endl;
    x++;
  }
  cout << "--------------------------------" << endl;

  // do-while
  int y = 0;
  do {
    cout << "[do-while] >> Nilai [y] => " << y << endl;
    y++;
  } while (y < 5);
  cout << "--------------------------------" << endl;

  // if
  bool kondisi = true;
  if (kondisi) {
    cout << "[if] >> Di eksekusi jika true" << endl;
  }
  cout << "--------------------------------" << endl;

  // if-else
  if (!kondisi) {
    cout << "[if-else] >> Di eksekusi jika true" << endl;
  } else {
    cout << "[if-else] >> Di eksekusi jika false" << endl;
  }
  cout << "--------------------------------" << endl;

  // switch-case
  int pilihan = 2;
  switch (pilihan) {
  case 1:
    cout << "[switch-case] >> pilihan = 1" << endl;
    break;
  case 2:
    cout << "[switch-case] >> pilihan = 2" << endl;
    break;
  case 3:
    cout << "[switch-case] >> pilihan = 3" << endl;
    break;

  default:
    cout << "[switch-case] >> pilihan tidak terdaftar" << endl;
    break;
  }
  return 0;
}