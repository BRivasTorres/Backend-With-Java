public class Gerente extends Funcionario implements Autenticable {

    // *A esto se le llama sobre-escritura de metodo */
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.1;
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
