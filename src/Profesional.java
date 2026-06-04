public abstract class Profesional implements Bonificable{
    private String nombre;
    private double salarioBase;

    public Profesional(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }


    @Override
    public void calcularPlusSalarial(double salarioBase, double salarioFinal) {
        System.out.println("El profesional tiene un salario fijo siempre" );
    }
}
