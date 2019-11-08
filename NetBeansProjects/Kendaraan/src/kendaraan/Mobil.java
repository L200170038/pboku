package kendaraan;


public class Mobil extends Kendaraan{
    public static void main(String[] args) {
        int sewaPerJam = 50000;
        int pajakPerTahun;
        int Angin;
        int Bensin;
        Kendaraan kendaraan = new Kendaraan();
        pajakPerTahun = kendaraan.hargaJual + sewaPerJam ;
        Angin = kendaraan.tekananAnginBan + sewaPerJam;
        Bensin = kendaraan.kapasitasBensin + sewaPerJam;
        System.out.println(pajakPerTahun);
        System.out.println(Angin);
        System.out.println(Bensin);
    }
    
}

