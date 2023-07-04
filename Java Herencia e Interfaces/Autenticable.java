public abstract interface Autenticable extends Funcionario {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public abstract boolean iniciarSecion(String clave);
}
