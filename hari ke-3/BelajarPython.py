# Membuat fungsi yang tidak mengembalikan nilai tanpa parameter.
def halo():
    print("Hallo semuanya")


# Membuat fungsi yang tidak mengembalikan nilai dengan parameter.
def sapa(nama):
    print(f"Hai {nama}")

# Membuat fungsi dengan parameter dan mengembalikan nilai.
def tambah(bil1, bil2):
    return bil1 + bil2


if __name__ == '__main__':
    # Memanggil fungsi hallo.
    halo()

    # Memanggil fungsi sapa dengan menambahkan argumen
    sapa("Python")

    # Menambung hasil yang dikembalikan dari fungsi tambah
    hasil = tambah(2,3)

    # Menampilkan hasilnya
    print(hasil)