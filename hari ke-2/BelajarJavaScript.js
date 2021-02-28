// module untuk membaca input dari console
// const readline = require('readline').createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

// Deklarasi variable
// Gunakan const jika nilai dari variabel tidak berubah-ubah
// Gunakan let jika nilai dari variabel akan berubah-ubah
// Pada javascript juga dapat menggunakan var, namun tidak direkomendasikan
const namaBuah = 'apel';
const jumlahBuah = 5;
console.log(`Itu adalah buah ${namaBuah} dan jumlahnya ada ${jumlahBuah}`);

// User Input
// readline.question('Masukkan nama buah : ', (namaBuahDariInputan) => {
//   readline.question('Masukkan jumlah buah : ', (jumlahBuahDariInputan) => {
//     console.log(
//       `Itu adalah buah ${namaBuahDariInputan} dan jumlahnya ada ${jumlahBuahDariInputan}`
//     );
//     console.log('--------------------------------');
//     readline.close();
//   });
// });

// for
for (let i = 0; i < 5; i++) {
  console.log(`[for] >> Nilai [i] => ${i}`);
}
console.log('--------------------------------');

// while
let x = 0;
while (x < 5) {
  console.log(`[while] >> Nilai [x] => ${x}`);
  x++;
}
console.log('--------------------------------');

// do-while
let y = 0;
do {
  console.log(`[do-while] >> Nilai [y] => ${y}`);
  y++;
} while (y < 5);
console.log('--------------------------------');

// if
const kondisi = true;
if (kondisi) {
  console.log('[if] >> Di eksekusi jika true');
}
console.log('--------------------------------');

// if-else
if (!kondisi) {
  console.log('[if-else] >> Di eksekusi jika true');
} else {
  console.log('[if-else] >> Di eksekusi jika false');
}
console.log('--------------------------------');

// switch-case
const pilihan = 2;
switch (pilihan) {
  case 1:
    console.log('[switch-case] >> pilihan = 1');
    break;
  case 2:
    console.log('[switch-case] >> pilihan = 2');
    break;
  case 3:
    console.log('[switch-case] >> pilihan = 3');
    break;

  default:
    console.log('[switch-case] >> pilihan tidak terdaftar');
    break;
}
