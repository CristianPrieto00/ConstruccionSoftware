public class Viaje {
    private double distancia;
    private double consumoPorLitro;
    private double precioCombustible;

    public Viaje(double distancia, double consumoPorLitro, double precioCombustible) {
        this.distancia = distancia;
        this.consumoPorLitro = consumoPorLitro;
        this.precioCombustible = precioCombustible;
    }

    //METODO PARA CALCULAR LITROS
    public double totalLitros() {
        return distancia / consumoPorLitro;
    }

    //METODO PARA CALCULAR EL PRRECIO TOTAL
    public double precioTotal() {
        return totalLitros() * precioCombustible;
    }

   

}
