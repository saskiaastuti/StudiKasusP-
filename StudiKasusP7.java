
package studikasusp7;

import java.util.Random;

class Kendaraan {
    String jenis;
    int biayaPerbaikan;

    Kendaraan(String jenis, int biayaPerbaikan) {
        this.jenis = jenis;
        this.biayaPerbaikan = biayaPerbaikan;
    }

    void perbaiki() {
        System.out.println("Memperbaiki " + jenis + " dengan biaya " + biayaPerbaikan + " ribu.");
    }
}

class Mobil extends Kendaraan {
    Mobil() {
        super("Mobil", 1500000);
    }
}

class Motor extends Kendaraan {
    Motor() {
        super("Motor", 500000);
    }
}

class Truk extends Kendaraan {
    Truk() {
        super("Truk", 2000000);
    }
}

class Bengkel {
    int pendapatanHariIni;

    Bengkel() {
        this.pendapatanHariIni = 0;
    }

    void perbaikiKendaraan(Kendaraan kendaraan) {
        kendaraan.perbaiki();
        pendapatanHariIni += kendaraan.biayaPerbaikan;
    }

    void lakukanPerbaikan(int jumlahKendaraan) {
        Kendaraan[] jenisKendaraan = {new Mobil(), new Motor(), new Truk()};
        Random random = new Random();

        for (int i = 0; i < jumlahKendaraan; i++) {
            Kendaraan randomKendaraan = jenisKendaraan[random.nextInt(jenisKendaraan.length)];
            perbaikiKendaraan(randomKendaraan);
        }
    }

    void tampilkanPendapatan() {
        System.out.println("Total pendapatan hari ini: " + pendapatanHariIni + " ribu.");
    }
}

public class StudiKasusP7 {
    public static void main(String[] args) {

        Bengkel bengkel = new Bengkel();

        int jumlahKendaraanPerHari = 10;

        bengkel.lakukanPerbaikan(jumlahKendaraanPerHari);

        bengkel.tampilkanPendapatan();
    }
}
