import 'dart:io';

void main() {
  // Deklarasi variable
  // Gunakan const / final jika nilai dari variabel tidak berubah-ubah
  String nama = "Sayuti";
  int umur = 19;
  print("Nama saya $nama, umur saya $umur");

  // User input
  stdout.write("Masukkan nama anda : ");
  nama = stdin.readLineSync();
  stdout.write("Masukkan umur anda : ");
  umur = int.parse(stdin.readLineSync());
  print("Nama saya $nama, umur saya $umur");
}
