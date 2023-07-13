public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;

    public Cuenta(int agencia) {
        int total = 0;
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
    }

    public abstract void depositar(double valor);

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
