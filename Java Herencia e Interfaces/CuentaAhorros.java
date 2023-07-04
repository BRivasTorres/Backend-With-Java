public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(int agencia) {
        super(agencia);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
}
