public class CursoPresencial extends Curso implements MetodologiaCurso{

    
    public CursoPresencial(String nombreCurso, String codigo, int numCreditos) {
        super(nombreCurso, codigo, numCreditos);
    }

    @Override
    public void iniciarCurso() {

        System.out.println("\nLa clase presencial se dictara en el aula 5-206");
        
    }

    @Override
    public void evaluarEstudiante() {

        System.out.println("El examen presencial se realizara en el aula 5-205 \n");
        
    }
    
    @Override
    public double calcularCosto(){
        double precioBase = super.calcularCosto();
        double recargoInstalaciones = precioBase * 0.15;
        double costoFinal = precioBase + recargoInstalaciones;
        return costoFinal;
    }

}
