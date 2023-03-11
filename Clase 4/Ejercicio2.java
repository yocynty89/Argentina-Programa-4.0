import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {
/*Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números
a. Al programa anterior agreguele un parámetro para que la operación pueda ser
suma o multiplicación.*/

    public static void main(String[] args) throws IOException{
        String archivo ="C:\\Users\\Cintia\\Desktop\\Desarrollador Java Inicial\\Clase4\\src\\Numeros.txt";

        System.out.println("******************PUNTO 1*************************");
        System.out.println("LA SUMA DE LOS ELEMENTOS DEL ARCHIVOS ES : " );
        System.out.println(suma(archivo));

        System.out.println("LA MULTIPLICACION DE LOS ELEMENTOS DEL ARCHIVOS ES : " );
        System.out.println(multiplicar(archivo));

        System.out.println("******************PUNTO a*************************");
        System.out.println("ELIJA LA OPERACION QUE DESEA HACER: 1) SUMAR  2)MULTIPLICAR");
        int n;
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();

        if (n==1){
        System.out.println("LA SUMA DE LOS ELEMENTOS DEL ARCHIVOS ES : " );
        System.out.println(suma(archivo));} else if (n==2) {

        System.out.println("LA MULTIPLICACION DE LOS ELEMENTOS DEL ARCHIVOS ES : " );
        System.out.println(multiplicar(archivo));  }
    }


        public static int suma(String args)throws IOException {
            int suma=0;
            for (String linea : Files.readAllLines(Paths.get(args))){//readAllLines necesita que ponga throws IOException
            suma =  suma +Integer.parseInt(linea);//transforma un string en un int

              }
            return suma;
        }

    public static int multiplicar(String args)throws IOException {
        int multiplicacion=1;
        for (String linea : Files.readAllLines(Paths.get(args))){//readAllLines necesita que ponga throws IOException
            multiplicacion =  multiplicacion *Integer.parseInt(linea);//transforma un string en un int

        }
        return multiplicacion;
    }

    }



