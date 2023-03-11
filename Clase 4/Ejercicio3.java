import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args)throws IOException {
        //Genere una clase que tenga los métodos para realizar la codificación y decodificación
        //de un string, dado un número de desplazamiento.
        String archivo = "C:\\Users\\Cintia\\Desktop\\Desarrollador Java Inicial\\Clase4\\src\\EntradaEj3.txt";
      String palabra = String.valueOf(Files.readAllLines(Paths.get(archivo)));//lee solo 1 renglon
            System.out.println(palabra);



        System.out.println("ELIJA LA CANTIDAD DE DESPLAZAMIENTO 1 o 2: ");
        Scanner leer = new Scanner(System.in);
        int desplazamiento = leer.nextInt();



        int cantCaracteres = palabra.length();
        String abecedario = " abcdefghijklmnñopqrstuvwxyz";
        int cantCaracteresAbc = abecedario.length();

        System.out.println("ELIJA 1)CODIFICACION o 2)DECODIFICACION: ");
        Scanner leer1 = new Scanner(System.in);
        int desicion=leer1.nextInt();
        String palabraCodificada=codif(desplazamiento, cantCaracteres, cantCaracteresAbc, palabra, abecedario);
        if(desicion==1){
            codif(desplazamiento, cantCaracteres, cantCaracteresAbc, palabra, abecedario);
            Files.writeString(Paths.get("C:\\Users\\Cintia\\Desktop\\Desarrollador Java Inicial\\Clase4\\src\\SalidaEj3.txt" ), palabraCodificada );
          //  System.out.println(palabraCodificada);
            System.out.println("GUARDADO CORRECTAMENTE");
        } else if (desicion==2) {
            String palabraDecodificada=decodificador(desplazamiento, cantCaracteres, cantCaracteresAbc, palabra, abecedario,palabraCodificada);
            Files.writeString(Paths.get("C:\\Users\\Cintia\\Desktop\\Desarrollador Java Inicial\\Clase4\\src\\SalidaEj3.txt"), palabraCodificada );
           // System.out.println(palabraDecodificada);
            System.out.println("GUARDADO CORRECTAMENTE");
        }



    }


    public static String codif(int desplazamiento, int tamPalabra, int tamAbc, String pal, String abc) {
        char letra;
        char letraAbc;
        String codificado = "";

        for (int i = 0;
             i < tamPalabra; i++) {
            letra = pal.charAt(i);//accede a cada uno de las letras


            for (int x = 0; x < tamAbc; x++) {
                letraAbc = abc.charAt(x);

                if (letra == letraAbc) {
                    letraAbc = abc.charAt(x + desplazamiento);

                    codificado = codificado + codificado.valueOf(letraAbc);
                }
            }


        }
        return codificado;}

    private static String decodificador( int desplazamiento, int tamPalabra, int tamAbc, String pal, String abc, String cod){
        char letra;
        char letraAbc;
        String decodificado = "";
            for (int i = 0;
                 i < tamPalabra; i++) {
                letra = cod.charAt(i);//accede a cada uno de las letras


                for (int x = 0; x < tamAbc; x++) {

                    letraAbc = abc.charAt(x);

                    if (letra == letraAbc) {
                        letraAbc = abc.charAt(x - desplazamiento);

                        decodificado = decodificado + cod.valueOf(letraAbc);
                    }
                }

            }
        return decodificado;

    }

}



