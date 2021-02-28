fun main() {
  // Deklarasi variable
  // Gunakan val jika nilai dari variabel tidak berubah
  // Gunakan var jika nilai dari variabel akan berubah-ubah
  var namaBuah:String = "apel"
  var jumlahBuah:Int = 5
  println("Itu adalah buah $namaBuah dan jumlahnya ada $jumlahBuah")

  // User input
  print("Masukkan nama buah : ")
  namaBuah = readLine().toString()
  print("Masukkan jumlah buah : ")
  jumlahBuah = readLine()!!.toInt()
  println("Itu adalah buah $namaBuah dan jumlahnya ada $jumlahBuah")
  println("--------------------------------")

  // for
  for(i in 0..5){
    println("[for] >> Nilai [i] => $i")
  }
  println("--------------------------------")

  // while
  var x:Int = 0
  while(x < 5){
    println("[while] >> Nilai [x] => $x")
    x++
  }
  println("--------------------------------")

  // do-while
  var y:Int = 0
  do{
    println("[do-while] >> Nilai [y] => $y")
    y++   
  }while(y < 5)
  println("--------------------------------")

  // if
  var kondisi:Boolean = true
  if(kondisi){
    println("[if] >> Di eksekusi jika true")
  }
  println("--------------------------------")

  // if-else
  if(!kondisi){
    println("[if-else] >> Di eksekusi jika true")
  }else{
    println("[if-else] >> Di eksekusi jika false")
  }
  println("--------------------------------")

  // switch-case *(when pada kotlin)
  var pilihan:Int = 2
  when (pilihan){
    1 -> println("[switch-case] >> pilihan = 1")
    2 -> println("[switch-case] >> pilihan = 2")
    3 -> println("[switch-case] >> pilihan = 3")
    else -> println("[switch-case] >> pilihan tidak terdaftar")
  }
}