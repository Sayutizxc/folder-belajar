import java.util.Scanner;

public class BelajarJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        // Deklarasi variable
        String namaBuah = "apel";
        int jumlahBuah = 5;
        System.out.println("Itu adalah buah " + namaBuah + " dan jumlahnya ada " + jumlahBuah);

        // User Input
        System.out.println("Masukkan nama buah : ");
        namaBuah = scan.next();
        System.out.println("Masukkan jumlah buah : ");
        jumlahBuah = scan.nextInt();
        scan.close();
        System.out.println("Itu adalah buah " + namaBuah + " dan jumlahnya ada " + jumlahBuah);
        System.out.println("--------------------------------");

        // for
        for (int i = 0; i < 5; i++) {
            System.out.println("[for] >> Nilai [i] => "+i);
        }
        System.out.println("--------------------------------");

        // while
        int x = 0;
        while (x < 5) {
            System.out.println("[while] >> Nilai [x] => "+x);
            x++;
        }
        System.out.println("--------------------------------");

        // do-while
        int y = 0;
        do {
            System.out.println("[do-while] >> Nilai [y] => "+y);
            y++;
        } while (y < 5);
        System.out.println("--------------------------------");

        // if
        boolean kondisi = true;
        if (kondisi) {
            System.out.println("[if] >> Di eksekusi jika true");
        }
        System.out.println("--------------------------------");

        // if-else
        if (!kondisi) {
            System.out.println("[if-else] >> Di eksekusi jika true");
        } else {
            System.out.println("[if-else] >> Di eksekusi jika false");
        }
        System.out.println("--------------------------------");

        // switch-case
        int pilihan = 2;
        switch (pilihan) {
            case 1:
                System.out.println("[switch-case] >> pilihan = 1");
                break;
            case 2:
                System.out.println("[switch-case] >> pilihan = 2");
                break;
            case 3:
                System.out.println("[switch-case] >> pilihan = 3");
                break;

            default:
                System.out.println("[switch-case] >> pilihan tidak terdaftar");
                break;
        }
    }
}