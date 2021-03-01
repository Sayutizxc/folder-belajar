fun main() {
  // Memanggil fungsi hallo.
  hallo();

  // Memanggil fungsi sapa dengan menambahkan argumen
  sapa("Kotlin");

  // Menambung hasil yang dikembalikan dari fungsi tambah
  val hasil:Int = tambah(2,3);
  // Menampilkan hasilnya
  println(hasil);
}

// Membuat fungsi dengan tipe fun (tidak mengembalikan nilai).
fun hallo(){
  println("Hallo semuanya");
}

// Membuat fungsi dengan tipe fun (tidak mengembalikan nilai) dengan parameter.
fun sapa(nama:String){
  println("Hai $nama");
}

// Membuat fungsi dengan parameter dan mengembalikan nilai dengan tipe integer.
fun tambah(bil1:Int, bil2:Int):Int{
  return bil1 + bil2;
}