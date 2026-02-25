import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa la cantidad de kilometros que desea recorrer");
        double kilometros = leer.nextDouble();
        System.out.println("ingresa el rendimiento de kilometros por litro de tu vehiculo");
        double rendimiento = leer.nextDouble();
        System.out.println("ingresa el valor del litro de combustible donde desea tanquear");
        double precio = leer.nextDouble();

        Viaje resultados = new Viaje(kilometros, rendimiento, precio);

        System.out.println("usted necesita " + resultados.totalLitros() + (" litros de combustible para su viaje"));
        System.out.println("el costo total del combustible que necesita para su viaje: " + resultados.precioTotal());


    }
}
