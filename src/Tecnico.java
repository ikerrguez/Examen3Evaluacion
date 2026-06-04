public class Tecnico extends Profesional implements Bonificable{
    private String puesto;

    public Tecnico(String nombre, double salarioBase, String puesto) {
        super(nombre, salarioBase);
        this.puesto = puesto;
    }

    @Override
    public void calcularPlusSalarial(double salarioBase, double salarioFinal) {
        System.out.println("Su bonus mensual siempre será de unos 200 euros");
        if (salarioBase <= 10000){
            salarioFinal = salarioBase + 200;
            System.out.println("El técnico se queda con un salario final de " + salarioFinal);
        }
    }
}
