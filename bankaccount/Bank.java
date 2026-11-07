package bankaccount;

public class Bank {
    private int saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setor(int setoran) {
        if (setoran > 0) {
            this.saldo += setoran;
        }
    }
    
    public boolean tarik(int tarik) {
        if (tarik > 15000 && tarik <= saldo) {
            saldo -= tarik;
            return true;
        } else {
            return false;
        }
    }
}
