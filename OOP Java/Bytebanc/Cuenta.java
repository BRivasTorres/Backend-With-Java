public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    public Cuenta(int agencia) {
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    };

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Cantidad no aceptada, excede el limite de saldo");
            return false;
        }
    };

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente, no se puede transferir dicha cantidad");
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
