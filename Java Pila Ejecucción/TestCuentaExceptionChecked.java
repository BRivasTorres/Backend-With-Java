public class TestCuentaExceptionChecked {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.deposita(); 
        } catch(MiExepción) {
            System.out.println("Mi exepcion");
        }
    }
}
