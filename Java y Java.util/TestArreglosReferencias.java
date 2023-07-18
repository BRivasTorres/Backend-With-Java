public class TestArreglosReferencias {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(23, 44);
        CuentaCorriente[] cuentas = new CuentaCorriente[5];
        cuentas[1] = cc;
        System.out.println(cc);
    }
}
