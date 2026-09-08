public class operadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de asignacion***");
        //Asignacion
        var miNumero = 15; //con var no hace fata especificar el tipo de variable.
        int miNumero2;
        miNumero2 = 15;

        //asignaciones compuestas
        //+=
        miNumero += 5; //miNumero = miNumero + 5
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /*, %=
        miNumero *= 2; // miNumero = miNumero * 2
        System.out.println("miNumero = " + miNumero);
        //asignacion de varibles multiple
       int a = 10, b = 20, c = 30;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
