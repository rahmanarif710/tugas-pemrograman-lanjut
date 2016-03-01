public class Mahasiswa {

    String nama, nim;
    int jumlahKata, jumlahHalaman = 30, jumlah;

    void isiData(String nama, String nim, int jumlahKata) {
        this.nama = nama;
        this.nim = nim;
        this.jumlahKata = jumlahKata;
        this.jumlah = jumlahKata * jumlahHalaman;
    }

    void tampilan() {
        System.out.println("Nama   = " + nama);
        System.out.println("NIM    = " + nim);
        System.out.print("Jumlah = ");
        if((jumlahKata<100) || (jumlahKata>500)){
            System.out.println("Salah");
        }else{
            System.out.println(jumlah);
        }
        System.out.println("");
    }
}