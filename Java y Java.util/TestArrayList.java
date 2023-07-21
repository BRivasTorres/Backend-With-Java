import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Cuenta> lista = new ArrayList();
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(13, 42);

        lista.add(0, cc2);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}
