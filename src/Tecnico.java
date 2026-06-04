public class Tecnico extends Profesional implements Bonificable{
    private String puesto;

    public Tecnico(String nombre, double salarioBase, String puesto) {
        super(nombre, salarioBase);
        this.puesto = puesto;
    }

    @Override
    public void calcularPlusSalarial() {

    }
}
