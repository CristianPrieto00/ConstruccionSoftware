import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        
        CursoPresencial  presencial1 = new CursoPresencial("\n Construccion de Software", "CS026 \n", 3);
        CursoPresencial  presencial2 = new CursoPresencial("\n Base de Datos", "BS026 \n", 4);
        CursoPresencial  presencial3 = new CursoPresencial("\n Ingles", "IG026 \n", 2);
        CursoVirtual virtual1 = new CursoVirtual("\n Base de Datos", "BSV026 \n", 4);
        CursoVirtual virtual2 = new CursoVirtual("\n Construccion de Software", "CSV026 \n", 3);
        CursoVirtual virtual3 = new CursoVirtual("\n Ingles", "IGV026 \n", 2);

        // LISTA PARA ALMACENAR LOS CURSOS
        ArrayList<Curso> listaCursos = new ArrayList<>();

        listaCursos.add(presencial1);
        listaCursos.add(presencial2);
        listaCursos.add(presencial3);
        listaCursos.add(virtual1);
        listaCursos.add(virtual2);
        listaCursos.add(virtual3);

        // FOR PARA RECOORER LA LISTA
        for (Curso curso : listaCursos) {
        
            // CASTING PARA ACCEDER A LOS METODOS DE LA INTERFAZ
            MetodologiaCurso interfaz = (MetodologiaCurso) curso;
            
            System.out.println("\n NOMBRE DEL CURSO: " + curso.getNombreCurso());
            System.out.println("\n CODIGO: " + curso.getCodigo());
            System.out.println("\n CREDITOS: " + curso.getNumCreditos());
            System.out.println("\n PRECIO DEL CURSO: " + curso.calcularCosto());

            interfaz.iniciarCurso();
            interfaz.evaluarEstudiante();
        }


        

    }
}
