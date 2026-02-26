import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int resultadoFinal;

        while(true){

        System.out.println("ingresa el tipo de electrodomestico que deseas comprar \n 1.Horno Microondas \n 2.Nevera \n 3.Lavadora");
        resultadoFinal = leer.nextInt();

        if(resultadoFinal >= 1 && resultadoFinal <= 3){
            break;

        } else {

            System.out.println("LA OPCION INGRESADA NO ES VALIDA, INTENTE NUEVAMENTE");

        }

        }


        switch (resultadoFinal){
            case 1: // EJECUTANDO EL CONSTRUCTOR CON VALORES POR DEFECTO
                Electrodomestico elec1 = new Electrodomestico();
                System.out.println("\n el precio base es: " + elec1.getPrecioBase());
                System.out.println("\n el color es: " + elec1.getColor());
                System.out.println("\n el peso es: " + elec1.getPeso());
                System.out.println("\n el consumo energetico el tipo: " + elec1.getConsumoEnergetico());
                System.out.println("\n El precio final es: " + elec1.precioFinal());
                break;

            case 2: // EJECUTANDO EL CONSTRUCTOR RECIBIENDO PRECIO BASE Y PESO
                System.out.println("ingresa el precio base");
                double precio1 = leer.nextDouble();

                System.out.println("ingresa el peso");
                double peso1 = leer.nextDouble();

                Electrodomestico elec2 = new Electrodomestico(precio1,peso1);
                System.out.println("\n el precio base es: " + elec2.getPrecioBase());
                System.out.println("\n el color es: " + elec2.getColor());
                System.out.println("\n el peso es: " + elec2.getPeso());
                System.out.println("\n el consumo energetico el tipo: " + elec2.getConsumoEnergetico());
                System.out.println("\n El precio final es: " + elec2.precioFinal());
                break;

            case 3: // EJECUTANDO CONSTRUCTOR RECIBIENDO TODOS LOS VALORES
                System.out.println("ingresa el precio base \n");
                double precio2 = leer.nextDouble();

                System.out.println("\n ingresa el peso \n");
                double peso2 = leer.nextDouble();

                System.out.println(" \n ingresa el color que desea \n 1.blanco \n 2.negro \n 3.rojo \n 4.azul \n 5.gris \n");
                String color1 = leer.next();

                System.out.println("\n 3ingresa el tipo de consumo energetico entre (A - F) \n");
                char consumo = leer.next().charAt(0);

                Electrodomestico elec3 = new Electrodomestico(precio2, peso2, color1, consumo);
                System.out.println("\n el precio base es: " + elec3.getPrecioBase());
                System.out.println("\n el color es: " + elec3.getColor());
                System.out.println("\n el peso es: " + elec3.getPeso());
                System.out.println("\n el consumo energetico el tipo: " + elec3.getConsumoEnergetico());
                System.out.println("\n El precio final es: " + elec3.precioFinal());
                break;

            default:
                System.out.println("LA OPCION INGRESADA NO ES VALIDA");

        }
    }
    
}
