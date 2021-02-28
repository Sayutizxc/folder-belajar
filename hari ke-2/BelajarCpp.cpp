#include <iostream>
using namespace std;

int main(){
    // Deklarasi variable
    // Gunakan const jika nilai dari variabel tidak berubah-ubah
    string nama = "Sayuti";
    int umur = 19;
    cout << "Nama saya " << nama << ", umur saya " << umur << endl;

    // User input
    cout << "Masukkan nama anda : ";
    cin >> nama;
    cout << "Masukkan umur anda : ";
    cin >> umur;
    cout << "Nama saya " << nama << ", umur saya " << umur << endl;
    
    return 0;
}
