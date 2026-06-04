public class Jugador extends Profesional implements Bonificable {
    private Posicion posicion;

    public Jugador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }


    @Override
    public void calcularPlusSalarial(double salarioBase, double salarioFinal) {
        System.out.println("El jugador siempre tendrá un bonus de un 10% de su salario base");
        if (salarioBase <= 10000){
            salarioFinal = salarioBase * 0.10;
            System.out.println("El jugador se queda con un salario final de " + salarioFinal);
        }
    }
}
