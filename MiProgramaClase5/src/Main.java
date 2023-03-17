import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int subtotal=0;
int total=0;

            System.out.println("BIENVENIDO!!");

        while (true) {
            System.out.println("ELIJA SUS PRODUCTOS \n 1)AZUCAR $215 \n 2)LECHE $235\n 3)PURE DE TOMATE  $160  \n 4)FIN DE LA COMPRA  ");
        System.out.println("*****************************   ");

            Scanner teclado = new Scanner(System.in);

            int eleccion = teclado.nextInt();


            switch (eleccion) {
                case 1:
                    Producto azucar = new Producto("azucar", 1001, 215);
                    System.out.println("INGRESE CANTIDAD: ");
                    Scanner teclado1 = new Scanner(System.in);
                    int eleccionCantidad = teclado1.nextInt();
                    new ItemCarrito(eleccionCantidad);
                    total = eleccionCantidad * azucar.getPrecio() + total;
                    subtotal = total;
                    //    System.out.println("TOTAL: $"+total);


                    break;
                case 2:
                    Producto leche = new Producto("leche", 1002, 235);
                    System.out.println("INGRESE CANTIDAD: ");
                    Scanner teclado2 = new Scanner(System.in);
                    int eleccionCantidad2 = teclado2.nextInt();
                    new ItemCarrito(eleccionCantidad2);
                    total = eleccionCantidad2 * leche.getPrecio() + total;
                    subtotal = total;
                    //  System.out.println("TOTAL: $"+total);

                    break;
                case 3:
                    Producto pureDeTomate = new Producto("pure de tomate", 1003, 160);
                    System.out.println("INGRESE CANTIDAD: ");
                    Scanner teclado3 = new Scanner(System.in);
                    int eleccionCantidad3 = teclado3.nextInt();

                    new ItemCarrito(eleccionCantidad3);
                    total = eleccionCantidad3 * pureDeTomate.getPrecio() + total;
                    subtotal = total;
                    //  System.out.println("TOTAL: $"+total);

                    break;
                case 4: System.out.println("SELECCIONE 1) SI ES JUBILADO \n 2)SI ES EMPLEADO \n 3)NINGUNO DE LOS ANTERIORES"  );
                    Scanner leo= new Scanner(System.in );
                    int dto=leo.nextInt();

                    switch (dto){
                        case 1: Descuento conDescuento= new Descuento();
                            conDescuento.dtoJubilado(total);
                            break;
                        case 2:Descuento conDescuentoE= new Descuento();
                            conDescuentoE.dtoEmpleado(total);
                            break;
                        default:
                            System.out.println("SU TOTAL ES: $" + total);
                            return ;


            }}



            }

    }}

/******CREAR CONTRUCTORES EN LA CLASE `PRODUCTOS************/