import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de kilometros que desea recorrer \n");
        double kilometros = leer.nextDouble();
        System.out.println("\n Ingresa el rendimiento de kilometros por litro de tu vehiculo \n");
        double rendimiento = leer.nextDouble();
        System.out.println("\n Ingresa el valor del litro de combustible donde desea tanquear \n");
        double precio = leer.nextDouble();

        Viaje resultados = new Viaje(kilometros, rendimiento, precio);

        System.out.println("\n Usted necesita " + resultados.totalLitros() + (" litros de combustible para su viaje"));
        System.out.println("\n El costo total del combustible que necesita para su viaje: " + resultados.precioTotal());


    }
}
