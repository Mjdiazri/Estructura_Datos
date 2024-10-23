import java.util.Arrays;

public class Vector {
    private Estudiantes[] alumnos = new Estudiantes[100];
    private int totalEstudiantes = 0;

        public void agregar (Estudiantes estudiante){
            //OPCION 1
//            for (int i = 0; i < alumnos.length; i++) {
//                if(alumnos[i] == null){
//                    alumnos[i] = estudiante;
//                    break;
//                }
//            }

            //OPCION 2
            this.alumnos[totalEstudiantes] = estudiante;
            totalEstudiantes ++;
        }

        public  Estudiantes obtener (int posicion){
            return null;
        }

        public  void eliminar (int posicion){

        }

        public boolean contiene(Estudiantes estudiante){
            return false;
        }

        public int tamanio(){
            return totalEstudiantes;
        }

        public String toString(){
            return Arrays.toString(alumnos);
        }
}
