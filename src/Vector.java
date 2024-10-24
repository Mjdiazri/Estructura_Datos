import java.util.Arrays;

public class Vector {
    private Estudiantes[] alumnos = new Estudiantes[100];
    private int totalEstudiantes = 0;

        //Metodo agregar estudiante: Agrega estudiante en orden
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



        //Metodo posicionOcupada:  Indica los parametros para que un nombre "exista" en el array (Que la posicion sea +0 y <al total de estudicantes )
        private boolean posicionOcupada(int posicion){
            return posicion >= 0 && posicion < totalEstudiantes;
        }



        //Metodo para encontrar el nombre de un estudiante por su posicion en el array
        public  Estudiantes obtener (int posicion){
            //Con excepciones
            if(!posicionOcupada(posicion)){
                throw new IllegalArgumentException("Posicion no encontrada");
            }
            return alumnos[posicion];
        }


        //Metodo para eliminar un estudiante

        public  void eliminar (int posicion){
            for (int i = posicion; i < this.totalEstudiantes ; i++) {
                this.alumnos[i] = this.alumnos[i+1];
            }

            totalEstudiantes --;
        }


        //Metodo para validar si un estudiante ya existe en el array
        public boolean contiene(Estudiantes estudiante){
            for (int i = 0; i < totalEstudiantes; i++) {
                if(estudiante.equals(alumnos[i])){
                    return true;
                }
            }
            return false;
        }



        //Metodo para establecer el tamaño del array. Solo incluye nombres
        public int tamanio(){
            return totalEstudiantes;
        }



        // *************** Metodo agregar en cualquier posicion*********************

        private boolean posicionValida(int posicion){
            return posicion >= 0 && posicion <= totalEstudiantes;
        }

        public void adiciona(int posicion, Estudiantes estudiante){

            if(!posicionValida(posicion)){
                throw new IllegalArgumentException("Posicion invalida");
            }

            for (int i = totalEstudiantes -1; i >= posicion ; i-=1) {
                alumnos[i+1] = alumnos[1];
            }

            alumnos[posicion] = estudiante;
            totalEstudiantes ++;
        }


        public String toString(){
            return Arrays.toString(alumnos);
        }
}
