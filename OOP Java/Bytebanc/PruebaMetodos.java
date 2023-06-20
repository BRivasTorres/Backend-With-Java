public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo);
        miCuenta.retirar(100);

        Cuenta cuentaSegunda = new Cuenta();
        cuentaSegunda.depositar(1000);
        cuentaSegunda.transferir(400, miCuenta);
        System.out.println(cuentaSegunda.saldo);
        System.out.println(miCuenta.saldo);
    }
}
