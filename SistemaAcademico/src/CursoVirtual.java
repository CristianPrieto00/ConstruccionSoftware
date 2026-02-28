public class CursoVirtual extends Curso implements MetodologiaCurso {

    
    public CursoVirtual(String nombreCurso, String codigo, int numCreditos) {
        super(nombreCurso, codigo, numCreditos);
    }

    @Override
    public void iniciarCurso() {

        System.out.println("\nLa clase se dictara a traves de la plataforma teams");
        
    }

    @Override
    public void evaluarEstudiante() {

        System.out.println("El examen se evaluara de manera virtual por la plataforma VirtualTdeA \n");
        
    }

    @Override
    public double calcularCosto(){
        double precioBase = super.calcularCosto();
        double recargoPlataforma = precioBase * 0.10;
        double costoFinal = precioBase + recargoPlataforma;
        return costoFinal;
    }

}
