public class Funcionario {
    private String nombre;
    private int document;
    private double salario;
    private int tipo;

    public Funcionario() {

    }

    public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion() {
        if (this.tipo == 0) {
            return this.salario * 0.1;
        } else if (this.tipo == 1) {
            return this.salario;
        } else {
            return salario;
        }
    }
}
