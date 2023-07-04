public class Administrador extends Funcionario implements Autenticable {

    public double getBonificacion() {
        return 0;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClave'");
    }

    @Override
    public boolean iniciarSecion(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarSecion'");
    }
}
