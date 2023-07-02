public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNombre("Torres");

        Gerente gerente = new Gerente();
        gerente.setNombre("Sandra");

        funcionario.setSalario(2000);
        gerente.setSalario(1000);
    }
}
