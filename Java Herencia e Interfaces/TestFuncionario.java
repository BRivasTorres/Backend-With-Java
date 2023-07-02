public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario klaus = new Contador();
        klaus.setNombre("Klaus");
        klaus.setDocument(4323);
        klaus.setSalario(2000);

        System.out.println(klaus.getDocument());
        System.out.println(klaus.getBonificacion());
    }
}
