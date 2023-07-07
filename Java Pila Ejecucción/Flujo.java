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
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                int num = 0;
                int resultado = i / num;
                System.out.println(resultado);
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }

        }
        System.out.println("Fin do metodo2");
    }

}
