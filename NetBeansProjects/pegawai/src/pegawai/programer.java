
package pegawai;


public class programer extends Pegawai{

    public static void main(String[] args) {
    int lemburPerJam = 50000;
    int gajiPerBulan;
    Pegawai pegawai = new Pegawai();
    gajiPerBulan = pegawai.gajiPokok + lemburPerJam ; 
    System.out.println(gajiPerBulan);
    }
    
}
