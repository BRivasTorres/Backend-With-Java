public class GuardaCuentas {
    Cuenta[] cuenta = new Cuenta[10];
    int indice = 0;

    public void adicionar(Cuenta cc) {
        cuenta[0] = cc;
        indice++;
    }

    public Cuenta obtener(int indice) {
        return cuenta[indice];
    }
}
