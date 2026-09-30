//class
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double ipk;
    int umur;
}

public class Class {

    public static void main(String[] args) {

        // instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Akhtar Fauzan";
        mahasiswa1.NIM = "D0226305";
        mahasiswa1.umur = 18;
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.ipk = 3.5;

        System.out.println("Nama\t:" + mahasiswa1.nama);
        System.out.println("NIM\t:" + mahasiswa1.NIM);
        System.out.println("Umur\t:" + mahasiswa1.umur);
        System.out.println("Jurusan\t:" + mahasiswa1.jurusan);
        System.out.println("IPK\t:" + mahasiswa1.ipk + "\n");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Aditya";
        mahasiswa2.NIM = "D0226308";
        mahasiswa2.umur = 20;
        mahasiswa2.jurusan = "bioteknologi";
        mahasiswa2.ipk = 4.0;

        System.out.println("Nama\t:" + mahasiswa2.nama);
        System.out.println("NIM\t:" + mahasiswa2.NIM);
        System.out.println("Umur\t:" + mahasiswa2.umur);
        System.out.println("Jurusan\t:" + mahasiswa2.jurusan);
        System.out.println("IPK\t:" + mahasiswa2.ipk);

    }
}
