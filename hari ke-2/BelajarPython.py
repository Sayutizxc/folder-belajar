# Deklarasi variable
namaBuah = "apel"
jumlahBuah = 5
print(f"Itu adalah buah {namaBuah} dan jumlahnya ada {jumlahBuah}")

# User input
namaBuah = input("Masukkan nama buah : ")
jumlahBuah = input("Masukkan jumlah buah : ")
print(f"Itu adalah buah {namaBuah} dan jumlahnya ada {jumlahBuah}")
print("--------------------------------")

#  for
for i in range(5):
    print(f"[for] >> Nilai [i] => {i}")
print("--------------------------------")

# while
x = 0
while (x < 5):
  print(f"[while] >> Nilai [x] => {x}")
  x+=1
print("--------------------------------")

# do-while
y = 0
while True: 
    print(f"[do-while] >> Nilai [y] => {y}")
    y+=1
    if not(y < 5):
        break
print("--------------------------------")

# if
kondisi = True
if (kondisi) :
    print(f"[if] >> Di eksekusi jika true")
print("--------------------------------")

# if-else
if (not kondisi):
    print(f"[if-else] >> Di eksekusi jika true")
else:
    print(f"[if-else] >> Di eksekusi jika false")
print("--------------------------------")
