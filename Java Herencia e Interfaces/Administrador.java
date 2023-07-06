public class Administrador extends Funcionario implements Autenticable {

    private String clave;

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSecion(String clave) {
        return this.clave == clave;
    }
}
