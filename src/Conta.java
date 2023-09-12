public class Conta {

    double saldo;
    String conta;

    public Conta (String conta) {
        saldo = 0;
        this.conta = conta;
    }

    public void depositar (double deposito) {
        saldo += deposito;
    }

    public void sacar (double sacar) {

        if(sacar > saldo) {
            System.out.println("Erro");
        } else {
            saldo -= sacar;
        }

    }

    public String toString () {
        return "saldo:"+saldo;
    }
}
