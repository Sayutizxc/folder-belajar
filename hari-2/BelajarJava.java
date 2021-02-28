import java.util.Scanner;

public class BelajarJava{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        // Deklarasi variable
        String nama = "Sayuti";
        int umur = 19;
        System.out.println("Nama saya "+ nama + ", umur saya "+ umur);

        // User Input
        System.out.print("Masukkan nama anda : ");
        nama = scan.next();
        System.out.print("Masukkan umur anda : ");
        umur = scan.nextInt();
        scan.close();
        System.out.println("Nama saya "+ nama + ", umur saya "+ umur);

    }
}