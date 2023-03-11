import java.util.Scanner;
public class clase3Ejercicio1 {
    public static void main(String[] args) {


        //a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
        System.out.println("**********PUNTO A********** ");

        String palabra = "escarabajo";
        String letra = "a";
        int contador = 0;
        int posicion = palabra.indexOf(letra); //indexof devuelve la ubicacion del caracter

        while (posicion != -1) {
            contador++;
            posicion = palabra.indexOf(letra, posicion + 1);
        }

        System.out.println("LA CANTIDAD DE VECES QUE APARECE EL CARACTER " + letra + " ES: " + contador);

        System.out.println("**********PUNTO B********** ");

        //b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        //mismos y los retorne en un vector de 3

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

        int vector[] = new int[3];
        vector[0]=num1;
        vector[1]=num2;
        vector[2]=num3;
        if ((num1 < num2) && (num1 > num3)) {

            vector[0] = num3;
            vector[1] = num1;
            vector[2] = num2;//bien
        } else if ((num1 < num3) && (num1 > num2)) {

            vector[0] = num2;
            vector[1] = num1;
            vector[2] = num3;//bien
        } else if((num1>num2)&&(num1>num3)&&(num2>num3)) {
            vector[0] = num3;
            vector[1] = num2;
            vector[2] = num1;
        }else if((num1>num2)&&(num1>num3)&&(num2<num3)){
            vector[0] = num2;
            vector[1] = num3;
            vector[2] = num1;
        }



      System.out.println("EL VECTOR ORDENADO DE FORMA ASCENDENTE MUESTRA: ");
       for(int indice = 0; indice<vector.length;indice++)
    {
        System.out.println(vector[indice]);
    }
        System.out.println("**********PUNTO C********** ");
       //c. dado un vector de números, y un número X, que sume todos los números > X yretorne el resultado
        int vectorNumeros[]= new int[5];
        vectorNumeros[0]=5;
        vectorNumeros[1]=1;
        vectorNumeros[2]=5;
        vectorNumeros[3]=0;
        vectorNumeros[4]=4;
        int numero=3;
        int acumulador=0;

        for(int i=0;i<vectorNumeros.length;i++){
            if(vectorNumeros[i]>numero){
                acumulador=acumulador+vectorNumeros[i];
            }
        }
        System.out.println("EL RESULTADO ES: "+ acumulador);
}}



