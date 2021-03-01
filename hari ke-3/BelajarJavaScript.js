(() => {
  // Memanggil fungsi hallo.
  hallo();

  // Memanggil fungsi sapa dengan menambahkan argumen
  sapa('JS');

  // Menambung hasil yang dikembalikan dari fungsi tambah
  const hasil = tambah(2, 3);
  // Menampilkan hasilnya
  console.log(hasil);
})();

// Membuat fungsi dengan tipe void (tidak mengembalikan nilai).
function hallo() {
  console.log('Hallo semuanya');
}

// Membuat fungsi dengan tipe void (tidak mengembalikan nilai) dengan parameter.
function sapa(nama) {
  console.log(`Hai ${nama}`);
}

// Membuat fungsi dengan parameter dan mengembalikan nilai dengan tipe functioneger.
function tambah(bil1, bil2) {
  return bil1 + bil2;
}
