public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean iniciarSecion(String clave) {
        return this.util.iniciarSecion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }
}
