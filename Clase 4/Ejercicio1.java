import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        //mismos y los retorne en un vector de 3

        /********************************PUNTO B******************************************************/
        System.out.println("*********************************PUNTO B********************************");
        int num1;
        Scanner leer1 = new Scanner(System.in);
        System.out.println("introduzca el primer numero: ");
        num1 = leer1.nextInt();

        int num2;
        Scanner leer2 = new Scanner(System.in);
        System.out.println("introduzca el segundo numero: ");
        num2 = leer2.nextInt();

        int num3;
        Scanner leer3 = new Scanner(System.in);
        System.out.println("introduzca el tercer numero: ");
        num3 = leer3.nextInt();

        char modo;
        Scanner letra = new Scanner(System.in);
        System.out.println("introduzca el modo a ordenar, descendente o ascendente: ");
        modo = letra.next().charAt(0);//toma el primer caracter

        int vector[] = new int[3];
        vector[0] = num1;
        vector[1] = num2;
        vector[2] = num3;


        if (modo == 'a') {
            ascendente(vector, num1, num2, num3);//llamo a la funcion
        } else if (modo == 'd') {
            descendente(vector, num1, num2, num3);//llamo a la funcion
        }


        System.out.println("***************************PUNTO A**********************************");
        main2(vector, 1, 5, 8, 'd');//cuando cambio x 'a' no da el resultado correcto

        System.out.println("***************************PUNTO C**********************************");
        main3(vector, 4, 3, 9);//cuando cambio x 'a' no da el resultado correcto

    }


    private static int ascendente(int[] vec, int n1, int n2, int n3) {

        if ((n1 < n2) && (n1 > n3) && (n2 > n3)) {

            vec[0] = n3;
            vec[1] = n1;
            vec[2] = n2;//bien
        } else if ((n1 < n3) && (n1 > n2) && (n3 > n2)) {

            vec[0] = n2;
            vec[1] = n1;
            vec[2] = n3;//bien
        } else if ((n1 > n2) && (n1 > n3) && (n2 > n3)) {
            vec[0] = n3;
            vec[1] = n2;
            vec[2] = n1;
        } else if ((n1 > n2) && (n1 > n3) && (n2 < n3)) {
            vec[0] = n2;
            vec[1] = n3;
            vec[2] = n1;
        }


        System.out.println("EL VECTOR ORDENADO DE FORMA ASCENDENTE MUESTRA: ");
        for (int indice = 0; indice < vec.length; indice++) {
            System.out.println(vec[indice]);

        }

        return 0;
    }

    private static int descendente(int[] vec, int n1, int n2, int n3) {

        if ((n1 > n2) && (n1 < n3) && (n3 > n2)) {

            vec[0] = n3;
            vec[1] = n1;
            vec[2] = n2;//bien
        } else if ((n1 > n3) && (n1 < n2) && (n2 > n3)) {

            vec[0] = n2;
            vec[1] = n1;
            vec[2] = n3;//bien
        } else if ((n1 < n2) && (n1 < n3) && (n2 < n3)) {
            vec[0] = n3;
            vec[1] = n2;
            vec[2] = n1;
        } else if ((n1 < n2) && (n1 < n3) && (n2 > n3)) {
            vec[0] = n2;
            vec[1] = n3;
            vec[2] = n1;
        }


        System.out.println("EL VECTOR ORDENADO DE FORMA DESCENDENTE MUESTRA: ");
        for (int indice = 0; indice < vec.length; indice++) {
            System.out.println(vec[indice]);

        }

        return 0;
    }

    public static void main2(int[] v, int nu1, int nu2, int nu3, char tetra) {
        if (tetra == 'a')

            ascendente(v, nu1, nu2, nu3);//llamo a la funcion
        else if (tetra == 'd') {

            descendente(v, nu1, nu2, nu3);//llamo a la funcion
        }

    }

    public static void main3(int[] v, int nu1, int nu2, int nu3) {
        char l;
        Scanner letra = new Scanner(System.in);
        System.out.println("introduzca el modo a ordenar, descendente o ascendente: ");
        l = letra.next().charAt(0);//toma el primer caracter

        if (l == 'a')

            ascendente(v, nu1, nu2, nu3);//llamo a la funcion
        else if (l == 'd') {

            descendente(v, nu1, nu2, nu3);//llamo a la funcion

        }


    }
}
