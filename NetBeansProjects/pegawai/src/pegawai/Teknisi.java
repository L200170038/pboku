package pegawai;

    
public class Teknisi extends Pegawai{
       public static void main(String[] args) {
           int lemburPerJam = 40000;
           int gajiPerBulan;
           Pegawai pegawai = new Pegawai();
           gajiPerBulan = Pegawai.gajiPokok+lemburPerJam;
           System.out.println(gajiPerBulan);
       }
}
