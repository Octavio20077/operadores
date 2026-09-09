import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro del Rango***");
        //primeros se definen los limites
        var Maximo = 5;
        var Minimo = 0;
        //solicitamos un valor ente 0 y 5
        System.out.print("-Agrega un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //verificar si el valor esta dentro de rango
        var estaDentroderango = dato >= Minimo && dato <= Maximo;
        System.out.println("estaDentroderango? = " + estaDentroderango);
    }
}
