public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

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

    public void setAgencia(int nuevaAgencia) {
        if (nuevaAgencia > 0) {
            this.agencia = nuevaAgencia;
        }
    }

    public int getAgencia() {
        return agencia;
    }
}
