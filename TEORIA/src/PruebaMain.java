public class PruebaMain {

    public static void main(String[] args) {
        saluda("Paco");
        saluda();
        saluda(33);
    }

    public static void saluda(){

        System.out.println("Hola mundo");
    }
    public static void saluda(String nombre){

        System.out.println("Hola" + nombre);
    }

    public static void saluda (int numero){

        System.out.println(numero);
    }
}
