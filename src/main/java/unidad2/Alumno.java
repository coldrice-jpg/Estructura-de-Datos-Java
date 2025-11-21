package unidad2;

public class Alumno {

    private String matricula;
    private String nombre;

    public void inscripcionCurso(){
        System.out.println("El alumno se ha inscrito ");
    }

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.inscripcionCurso();




    }

    public static class Alumno {

        private String matricula;
        private String nombre;

        public Alumno(){
            System.out.println("Alumno creado");
        }
        public void incripcionCurso(){
            System.out.println("El alumno se ha inscrito al curso");
        }
        public void inscripcionTaller(){
            System.out.println("Alumno inscrito al taller de Base de datos");
        }
        public double pagoMensualidad(){
            return 1500.00;
        }
        public int calcularHorasEstudio(int horasPorDia, int diasSemana){
            return horasPorDia * diasSemana;
        }
    }
}
