import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int resultado;
        char continuar;
        
        // CREACION DE CUENTA EN EL SISTEMA
        System.out.println("\n Ingrese su nombre para crear su cuenta bancaria \n");
        String nomTitular = leer.nextLine();

        Cuenta cuenta = new Cuenta(nomTitular, 0);


        
        do{

            System.out.println("\n ingresa la opcion que deseas relizar \n 1.Ingresar dinero \n 2.Retirar dinero \n 3.Mostrar datos de la cuenta \n");
            resultado = leer.nextInt();

            while (resultado < 1 || resultado > 3) {
                System.out.println("Opción inválida, intente nuevamente:");
                resultado = leer.nextInt();
            }

        
        switch(resultado){
            
            case 1: // CASO PARA INGRESAR DINERO
                
                System.out.println("\n ingresa la cantidad que desea ingresar \n");
                double montoIng = leer.nextDouble();
                cuenta.ingresar(montoIng);
                break;

            case 2: //  CASO PARA RETIRAR DINERO

                System.out.println("\n Ingrese la cantidad que desea retirar \n");
                double montoRet = leer.nextDouble();
                cuenta.retirar(montoRet);
                break;

            case 3: // CASO PARA MOSTRAR DATOS DE LA CUENTA

                System.out.println("\n DATOS DE LA CUENTA");
                System.out.println("\n NOMBRE DEL TITULAR: " + cuenta.getTitular());
                System.out.println("\n CANTIDAD DE DINERO: " + cuenta.getCantidad());
                break;

                
        }

        System.out.println("\n Desea realizar otra operacion? (s/n) \n");
        continuar = leer.next().charAt(0);

        } while(continuar == 's' || continuar == 'S');
        
        System.out.println("\n GRACIAS POR USAR EL SISTEMA");

        

    }
}
