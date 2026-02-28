public class Curso {

    private String nombreCurso;
    private String codigo;
    private int numCreditos;


    public Curso(String nombreCurso, String codigo, int numCreditos) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.numCreditos = numCreditos;
    }


    public String getNombreCurso() {
        return nombreCurso;
    }


    public String getCodigo() {
        return codigo;
    }


    public int getNumCreditos() {
        return numCreditos;
    }

    
    public double calcularCosto(){
        int valorCredito = 20000;
        return valorCredito * numCreditos;
    }


    
}
