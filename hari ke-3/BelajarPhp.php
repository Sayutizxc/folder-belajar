<?php      
      // Membuat fungsi dengan tipe void (tidak mengembalikan nilai).
      function hallo() {
        echo "Hallo semuanya\n";
      }
      
      // Membuat fungsi dengan tipe void (tidak mengembalikan nilai) dengan parameter.
      function sapa($nama) {
        echo "Hai $nama\n";
      }
      
      // Membuat fungsi dengan parameter dan mengembalikan nilai dengan tipe functioneger.
      function tambah($bil1, $bil2) {
        return $bil1 + $bil2;
      }

      // Memanggil fungsi hallo.
      hallo();
    
      // Memanggil fungsi sapa dengan menambahkan argumen
      sapa("PHP");
    
      // Menambung hasil yang dikembalikan dari fungsi tambah
      $hasil = tambah(2, 3);
      // Menampilkan hasilnya
      echo "$hasil\n";     
?>