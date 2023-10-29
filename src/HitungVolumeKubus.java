import java.util.Scanner;

import java.util.Scanner;

public class HitungVolumeKubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");

        // Membaca input panjang sisi dari pengguna
        double panjangSisi = input.nextDouble();

        // Menghitung volume kubus dengan rumus panjangSisi * panjangSisi * panjangSisi
        double volumeKubus = panjangSisi * panjangSisi * panjangSisi;

        // Menampilkan hasil volume kubus ke layar
        System.out.println("Volume kubus dengan panjang sisi " + panjangSisi + " adalah: " + volumeKubus);

        // Menutup objek Scanner untuk menghindari kebocoran sumber daya
        input.close();
    }
}

