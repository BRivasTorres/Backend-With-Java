public class TestArregloReferencias {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(23, 56);
        CuentaCorriente[] cuentas = new CuentaCorriente[5];
        cuentas[1] = cc;

        System.out.println(cc);
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i]);
        }
    }
}
