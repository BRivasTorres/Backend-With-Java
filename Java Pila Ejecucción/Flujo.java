public class Flujo {
    public static void main(String[] args) {
        System.out.println("IN do main");
        metodo1();
        System.out.println("Fin do main");
    }

    public static void metodo1() {
        System.out.println("In do metodo1");
        metodo2();
        System.out.println("Fin do metodo1");
    }

    public static void metodo2() {
        System.out.println("IN do metodo2");
        throw new ArithmeticException();
    }

}
