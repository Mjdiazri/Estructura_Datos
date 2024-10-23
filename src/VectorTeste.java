public class VectorTeste {
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes("Pinguina");
        Estudiantes estudiante2 = new Estudiantes("Caballo");


        Vector lista = new Vector();

        System.out.println(lista.tamanio());
        lista.agregar(estudiante1);
        System.out.println(lista.tamanio());
        lista.agregar(estudiante2);
        System.out.println(lista.tamanio());

        System.out.println(lista);

    }
}
