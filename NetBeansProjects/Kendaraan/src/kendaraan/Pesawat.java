package kendaraan;


public class Pesawat {
    public static void main(String[] args) {
        int hargaTiket = 1000000;
        int pajakPerHari;
        int Angin;
        int kondisiMesin = 100;
        Kendaraan kendaraan = new Kendaraan();
        pajakPerHari = kendaraan.hargaJual + hargaTiket; 
        Angin = kendaraan.tekananAnginBan + hargaTiket;
        kondisiMesin = kendaraan.kondisi + hargaTiket;
        System.out.println(pajakPerHari);
        System.out.println(Angin);
        System.out.println(kondisiMesin);
    }
       
}