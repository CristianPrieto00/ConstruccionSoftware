import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int tipo_Operacion;
        Figura resultado = null;


        while (true){

        System.out.println("ingrese el numero del tipo de operacion que desea realizar \n 1.Triangulo \n 2.Rectangulo \n 3.Circulo \n 4.Cuadrado");
        tipo_Operacion = leer.nextInt();

        if (tipo_Operacion >= 1 && tipo_Operacion <= 4){
            break;

        } else {
            System.out.println("LA OPCION INGRESADA NO ES VALIDA, INTENTE NUEVAMENTE");
        }

        }


        switch(tipo_Operacion){
        case 1://ELIJIENDO TRIANGULO

            System.out.println("Ingresa el color");
            String colorTri = leer.next();

            System.out.println("ingresa el valor de la base");
            double baseTri = leer.nextDouble();

            System.out.println("ingresa el valor de la altura");
            double alturaTri = leer.nextDouble();

            System.out.println("ingresa el valor del lado 1");
            double l1 = leer.nextDouble();

            System.out.println("ingresa el valor del lado 2");
            double l2 = leer.nextDouble();

            System.out.println("ingresa el valor del lado 3");
            double l3 = leer.nextDouble();

            resultado = new Triangulo(colorTri, baseTri, alturaTri, l1, l2, l3);

            break;

        case 2://ELIJIENDO RECTANGULO

            System.out.println(" ingresa el color");
            String colorRec = leer.next();

            System.out.println("ingresa el valor de la base");
            double baseRec = leer.nextDouble();

            System.out.println("ingresa el valor de la altura");
            double alturaRec = leer.nextDouble();

            resultado = new Rectangulo(colorRec, baseRec, alturaRec);

            break;

        case 3: //ELIJIENDO CIRCULO
            
            System.out.println("ingresa el color");
            String colorCir = leer.next();

            System.out.println("ingresa el valor del radio");
            double radioCir = leer.nextDouble();

            resultado = new Circulo(colorCir, radioCir);

            break;

        case 4: //ELIIENDO CUADRADO
            
            System.out.println("ingresa el color");
            String colorCuad = leer.next();

            System.out.println("ingresa el valor de alguno de los lados");
            double ladoCuad = leer.nextDouble();

            resultado = new Cuadrado(colorCuad, ladoCuad);

            break;

    }

    resultado.imprimir();

    System.out.println("Legustaria cambiar el color de su figura?");
    String respuesta = leer.next();

    if (respuesta.equalsIgnoreCase("si")) {

        System.out.println("Ingresa el nuevo color");
        String nuevoColor = leer.next();

        resultado.cambiarColor(nuevoColor);
        resultado.imprimir();
        }

    }

}
