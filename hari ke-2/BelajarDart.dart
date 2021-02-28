import 'dart:io';

void main() {
  // Deklarasi variable
  // Gunakan const / final jika nilai dari variabel tidak berubah-ubah
  String namaBuah = "apel";
  int jumlahBuah = 5;
  print("Itu adalah buah $namaBuah dan jumlahnya ada $jumlahBuah");

  // User input
  stdout.write("Masukkan nama buah : ");
  namaBuah = stdin.readLineSync();
  stdout.write("Masukkan jumlah buah : ");
  jumlahBuah = int.parse(stdin.readLineSync());
  print("Itu adalah buah $namaBuah dan jumlahnya ada $jumlahBuah");
  print("--------------------------------");

  // for
  for(int i = 0; i < 5; i++){
    print("[for] >> Nilai [i] => $i");
  }
  print("--------------------------------");

  // while
  int x = 0;
  while(x < 5){
    print("[while] >> Nilai [x] => $x");
    x++; 
  }
  print("--------------------------------");

  // do-while
  int y = 0;
  do{
    print("[do-while] >> Nilai [y] => $y");
    y++;   
  }while(y < 5);
  print("--------------------------------");

  // if
  bool kondisi = true;
  if(kondisi){
    print("[if] >> Di eksekusi jika true");
  }
  print("--------------------------------");

  // if-else
  if(!kondisi){
    print("[if-else] >> Di eksekusi jika true");
  }else{
    print("[if-else] >> Di eksekusi jika false");
  }
  print("--------------------------------");

  // switch-case
  int pilihan = 2;
  switch (pilihan)
  {
  case 1:
    print("[switch-case] >> pilihan = 1");
    break;
  case 2:
    print("[switch-case] >> pilihan = 2");
    break;
  case 3:
    print("[switch-case] >> pilihan = 3");
    break;

  default:
    print("[switch-case] >> pilihan tidak terdaftar");
    break;
  }
}
