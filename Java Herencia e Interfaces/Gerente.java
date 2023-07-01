public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSecion(String clave) {
        return clave == "HolaMundo";
    }

    // *A esto se le llama sobre-escritura de metodo */
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.1;
    }
}
