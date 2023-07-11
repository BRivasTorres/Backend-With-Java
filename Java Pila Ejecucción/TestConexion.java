public class TestConexion {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.leerDatos();
        } catch (IllegalStateException ex) {
            System.out.println("reciviendo expection");
            ex.printStackTrace();
        } finally {
            System.out.println("Ejecutando finally");
            con.cerrar();
        }
    }
}
