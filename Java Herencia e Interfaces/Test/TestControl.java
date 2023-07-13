public class TestControl {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        ControlBonificaciones control = new ControlBonificaciones();
        control.registrarSalario(diego);

        Contador alexis = new Contador();

    }
}
