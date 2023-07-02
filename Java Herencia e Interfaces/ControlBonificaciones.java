public class ControlBonificaciones {
    private double suma;

    public double registrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() + this.suma;
        return this.suma;
    }

    public double registrarSalario(Gerente gerente) {
        this.suma = gerente.getBonificacion() + this.suma;
        return this.suma;
    }

    public double registrarSalario(Contador contador) {
        this.suma = contador.getBonificacion() + this.suma;
        return this.suma;
    }
}
