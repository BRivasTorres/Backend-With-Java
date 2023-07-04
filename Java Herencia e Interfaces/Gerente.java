public class Gerente extends Autenticable {

    // *A esto se le llama sobre-escritura de metodo */
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.1;
    }
}
