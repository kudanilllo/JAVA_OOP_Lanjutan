package Method;

class Mahasiswa {

    //
    String nama;
    String NIM;
    String jurusan;

    // constructor
    Mahasiswa(String nama, String NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;

    }
    //method tanpa return tanpa parameter
    void show(){
        System.out.println("Nama\t: " + this.nama);
        System.out.println("NIM\t: " + this.NIM);
        System.out.println("Jurusan\t :" + this.jurusan + "\n");
    }

    //method tanpa return dengan parameter
    void ubahNama(String jurusan){
        this.jurusan = jurusan;
    }

    //method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }

    //method dengan return dan parameter
    String sayHi(String message){
        return this.nama +" "+ message;
    }
}

public class Method {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Akhtar Fauzan", "D0226305", "Informatika");
        mahasiswa1.show();
        mahasiswa1.ubahNama("Teknik Nuklir");
        mahasiswa1.show();

        String nama = mahasiswa1.getNama();
        System.out.println(nama);

        String data = mahasiswa1.sayHi("orang baik");
        System.out.println(data);

    }
}
