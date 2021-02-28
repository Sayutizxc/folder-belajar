const readline = require('readline');

// Deklarasi variable
// Gunakan const jika nilai dari variabel tidak berubah-ubah
// Gunakan let jika nilai dari variabel akan berubah-ubah
// Pada javascript juga dapat menggunakan var, namun tidak direkomendasikan
const nama = 'Sayuti';
const umur = 19;
console.log(`Nama saya ${nama}, umur saya ${umur}`);

// User Input
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question('Masukkan nama anda : ', (namaDariInputan) => {
  rl.question('Masukkan umur anda : ', (umurDariInputan) => {
    console.log(`Nama saya ${namaDariInputan}, umur saya ${umurDariInputan}`);
    rl.close();
  });
});
