import java.util.Scanner;

public class CalculodeAreayPerimetro {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("***Calculo del Area y Perimetro de un Rectangulo***");

        //quitamos los datos de triangulo
        System.out.print("--Cual es la medida de la altura?:");
        int Base = Integer.parseInt(consola.nextLine());

        System.out.print("--Cual es la medida de la Altura?: ");
        int Altura = Integer.parseInt(consola.nextLine());

        //Calculamos el Area
        int Area = Base * Altura;
        System.out.println("--El Area del rectangulo es = " + Area);

        //Calculamos el perimetro
        int Perimetro = (Base + Altura) * 2;

        System.out.println("--El perimetro del rectangulo es = " + Perimetro );

    }
}
