package bankaccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank rekAtar = new Bank();
        // variable
        int pilihan;
        boolean putusan = false;

        do {// loop mesin putusan user

            // input & menu
            System.out.println("==== SELAMAT DATANG DI ATM ====");
            System.out.println("""
                    Silahakan Pilih Menu di bawah ini :D
                    1.Setor saldo
                    2.Cek saldo
                    3.Tarik saldo
                        """);

            do {
                System.out.print("Pilihan anda (1-3): ");
                pilihan = sc.nextInt();

            } while (pilihan < 1 && pilihan > 3);

            switch (pilihan) {
                case 1: // setoran-
                    int inSetoran; // variable
                    System.out.print("Minimal setoran 10.000rb\nJumlah Setoran : ");
                    do {
                        inSetoran = sc.nextInt();
                        if (inSetoran >= 10000) {
                            rekAtar.setor(inSetoran);
                            System.out.println("Setoran berhasil masuk ke rekening anda!");
                        } else {
                            System.out.println("Setoran di bawah 10.000!");
                            break;
                        }
                    } while (inSetoran < 10000);

                    break;
                case 2: // cek saldo
                    if (rekAtar.getSaldo() >= 1000000) {
                        System.out.println("Jumlah saldo anda : " + rekAtar.getSaldo() + "Jt");
                    } else {
                        System.out.println("Jumlah saldo anda : " + rekAtar.getSaldo() + "Rb");
                    }
                    break;
                case 3:// menarik
                    System.out.println("MINIMMAL PENARIKAN 15.000RB ");
                    System.out.print("Jumlah saldo yang ingin di tarik : ");
                    int inJumlahTarik; // variable

                    do {
                        inJumlahTarik = sc.nextInt();
                        if (inJumlahTarik >= 15000 && inJumlahTarik <= rekAtar.getSaldo()) {
                            boolean statusTarik = rekAtar.tarik(inJumlahTarik);
                            if (statusTarik) {
                                System.out.println("Penarian Berhasil!");
                            }
                        } else if (inJumlahTarik < 15000) {
                            System.out.println("Minimum penarikan 15.000!");
                            break;
                        } else if (rekAtar.getSaldo() < 15000 || inJumlahTarik > rekAtar.getSaldo()) {
                            System.out.println("Saldo anda tidakk cukup untuk melakukan penarikan!");
                            break;
                        }
                    } while (inJumlahTarik <= 15000);

                    break;
                default:
                    break;

            }
            System.out.println("Apakah anda masi ingin melakukan transaksi? y/n : ");
            char inYN = sc.next().charAt(0);

            if (inYN == 'y') {
                putusan = true;
            } else {
                putusan = false;
            }
        } while (putusan);
        
    }
}
