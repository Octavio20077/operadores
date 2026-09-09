import java.util.Scanner;

public class RangodeVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un valor entero: ");
        var valorEntero = Integer.parseInt(consola.nextLine());

        //un valor del rango entre 1 y 10
        var estaDentrodelrango = valorEntero >= 1 && valorEntero <=10;
        System.out.print("El valor esta dentro del rango?:  = " + estaDentrodelrango);
    }


}