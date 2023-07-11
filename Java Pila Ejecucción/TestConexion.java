public class TestConexion {

    public static void main(String[] args) throws Exception {
        Conexion con = new Conexion();
        try (Conexion con = new Conexion()) {
            con.leerDatos();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }

        // try {
        // con.leerDatos();
        // } catch (IllegalStateException ex) {
        // System.out.println("reciviendo expection");
        // ex.printStackTrace();
        // } finally {
        // System.out.println("Ejecutando finally");
        // con.cerrar();
        // }
    }
}
