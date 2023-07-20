public class TestGuardarCuentas {
    public static void main(String[] args) {

        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.adicionar(cc);
    }

}
