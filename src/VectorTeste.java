public class VectorTeste {
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes("Pinguina");
        Estudiantes estudiante2 = new Estudiantes("Caballo");


        Vector lista = new Vector();

        //Prueba tamaño lista
        System.out.println(lista.tamanio());
        //Prueba agregar estudiante
        lista.agregar(estudiante1);
        System.out.println(lista.tamanio());
        lista.agregar(estudiante2);
        System.out.println(lista.tamanio());

        System.out.println(lista);
        //Prueba metodo contiene
        System.out.println(lista.contiene(estudiante1));
        Estudiantes estudiante3 = new Estudiantes("Panchito");
        System.out.println(lista.contiene(estudiante3));

        //Prueba obtener estudiante
        Estudiantes estudianteX = lista.obtener(1);
        System.out.println(estudianteX);

        //Prueba metodo adiciona, poner estudiante en una posicion
        lista.adiciona(1,estudiante3);
        System.out.println(lista);

        //Prueba metodo quitar un estudiante
        lista.eliminar(2);
        System.out.println(lista);




    }
}
