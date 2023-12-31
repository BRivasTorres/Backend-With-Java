import java.util.ArrayList;
import java.util.List;

public class TestOrdenarLista {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(11, 33);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(22);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(22);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
    }
}
