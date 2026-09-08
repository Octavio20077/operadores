public class operasoresUnarios {
    public static void main(String[] args) {
        System.out.println("***Operadores uarios***");
         int a = 3, b = -2, resultado;
         boolean c = true;
         //operador unario positivo +
        resultado = a;
        System.out.println("resultado +a: = " + resultado);

        // operdor unario negativo -i
        resultado = -a;
        System.out.println("resultado -a: = " + resultado);

        //unarios de incremento y decremento
        //pre-incremento
        resultado = ++a;
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento =" + a);

        //post-incremento
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("resultado de a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        //pre-decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b = " + resultado);
        System.out.println("b = " + b);
        //post-decremento
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b = " + b);


    }
}
