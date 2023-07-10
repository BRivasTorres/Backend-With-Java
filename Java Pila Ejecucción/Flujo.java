public class Flujo {
    public static void main(String[] args) {
        System.out.println("IN do main");
        try {
            metodo1();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin do main");
    }

    public static void metodo1() throws MiExepción {
        System.out.println("In do metodo1");

        try {
            metodo2();
        } catch (MiExepción me) {
            me.printStackTrace();
        }

        System.out.println("Fin do metodo1");
    }

    public static void metodo2() {
        System.out.println("IN do metodo2");
        throw new MiExepción("Mi exepcion fue lanzada");
        // metodo2();
    }
}
