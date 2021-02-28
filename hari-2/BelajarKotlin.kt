fun main() {
  // Deklarasi variable
  // Gunakan val jika nilai dari variabel tidak berubah
  // Gunakan var jika nilai dari variabel akan berubah-ubah
  var nama:String = "Sayuti"
  var umur:Int = 19
  println("Nama saya $nama, umur saya $umur")

  // User input
  print("Masukkan nama anda : ")
  nama = readLine().toString()
  print("Masukkan umur anda : ")
  umur = readLine()!!.toInt()
  println("Nama saya $nama, umur saya $umur")
}