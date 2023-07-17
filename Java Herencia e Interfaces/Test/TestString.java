public class TestString {
    public static void main(String[] args) {
        String nombre = "Alura";
        System.out.println("Antes de replace " + nombre);

        nombre = nombre.replace("A", "a");
        nombre = nombre.concat("Cursos online");
        nombre = nombre.toUpperCase();
        System.out.println("Despues de replace" + nombre);
    }
}
