public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(400);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.depositar(500);
        System.out.println(segundaCuenta.getSaldo());

        Cuenta terceraCuenta = segundaCuenta;

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
        System.out.println(terceraCuenta);

    }
}
