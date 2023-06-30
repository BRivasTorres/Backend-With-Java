public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Alan");
        cliente.setDocumento("N456JF");

        cuenta.setTitular(cliente);
        System.out.println(cliente.getNombre());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
