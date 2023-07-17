//import com.bytebank.modelo.test;
//import com.bytebank.modelo.*;

/**
 * Cuenta va a crear nuevas instancias de CuentaCorriente
 * 
 */

public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println(gerente.getSalario());
    }
}
