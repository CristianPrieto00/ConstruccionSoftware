public class Cuenta {

    private String titular;
    private double cantidad;

    // CONSTRUCTOR VACIO
    public Cuenta() {
    }


    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }


    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getCantidad() {
        return cantidad;
    }

    // ENCAPSULAMIENTO PARA EVITAR QUE SE PUEDA MODIFICAR DIRECTAMENTE
    private void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // METODO PARA MOSTRAR LOS DATOS DE LA CUENTA
    public void mostrar(){

        System.out.println("\n Nombre del titular \n" + titular);
        System.out.println("\n cantidad total \n" + cantidad);

    }

    // METODO PARA INGRESAR DINERO
    public void ingresar(double cantidad){

        if(cantidad > 0){
            setCantidad(getCantidad() + cantidad);

        }  
            
    }

    // METODO PARA RETIRAR DINERO
    public void retirar(double cantidad){

        this.cantidad = this.cantidad - cantidad;

    }
    

}
