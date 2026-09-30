package Constructor;
//class constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // constructor di panggil saat objek pertama kali di buat

    //constructor dengan parameter
    Mahasiswa(String inNama, String inNIM, String inJurusan) {
        nama = inNama;
        NIM = inNIM;
        jurusan = inJurusan;
        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(NIM);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("AkhtarFauzan", "TeknikInfor", "D0226305");
        Mahasiswa mahasiswa2 = new Mahasiswa("ReskiAditya", "Bioteknologi", "D0226308");

    }
}
