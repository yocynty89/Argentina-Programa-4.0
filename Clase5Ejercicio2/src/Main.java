import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
public class Main {
    private static int can;
    private static int pre;
    private static int totalDesdePrecio=0;
    private static int totalFinal;
    public static void main(String[] args)throws IOException {
        System.out.println("cant precioUnitario producto");
        String archivo="C:\\Users\\Cintia\\Desktop\\Desarrollador Java Inicial\\Clase5Ejercicio2\\src\\lista_productos.txt";
        for (String linea:Files.readAllLines(Paths.get(archivo))) {
            System.out.println(linea);
            String lineaSeparada[]=linea.split(" ");//separa la linea y lo transforma en array
        //   System.out.println(lineaSeparada[]);
           String c=lineaSeparada[0];
          String p=lineaSeparada[1];
          can = Integer.parseInt(c);
           pre = Integer.parseInt(p);
           Carrito total=new Carrito();
           totalFinal= total.Precio(can,pre);
            totalDesdePrecio=totalDesdePrecio+totalFinal;

        }

         System.out.println("carrito.precio()=="+totalDesdePrecio);


    }
}