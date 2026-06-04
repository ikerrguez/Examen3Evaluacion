import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            try{
                System.out.println("Elija una opción entre 1 y 5");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Contratando a jugadores...");
                        System.out.println("Dime el nombre del jugador: ");
                        String nombre = sc.next();
                        System.out.println("Cuanto cobra de salario base?");
                        double salarioBase = sc.nextDouble();
                        System.out.println("De que juega?");
                        String posicion = sc.next();

                        if (salarioBase >= 10000) {
                            System.err.println("El fichaje se está cancelando. Salario excedido");
                    }
                        return;
                        case 2:
                            System.out.println("Contratando cuerpo técnico");
                            System.out.println("Dime su nombre: ");
                            String nombreCuerpo = sc.next();
                            System.out.println("Cuanto cobra de salario base?");
                            double salarioBaseCuerpo = sc.nextDouble();
                            System.out.println("¿Qué función realiza?");
                            String posicionCuerpo = sc.next();

                            if (salarioBaseCuerpo >= 10000) {
                                System.err.println("No se puede comprar este cuerpo técnico, no hay dinero suficiente");
                            }
                            return;

                            case 3:
                                System.out.println("Depidiendo a profesional...");
                                System.out.println("Dime su nombre: ");
                                String nombreProfesional = sc.next();

                                
                    }
                    return;


            }catch(Exception e){





            }

        }while (!continuar);


    }
}
