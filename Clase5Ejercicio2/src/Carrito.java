public class Carrito {
    private int cantidad;
   private int precio;
          private  int total;

    public int Precio(int cant,int pre) {
        cantidad=cant;
        precio = pre;
        total=cantidad*precio;

        return total;
    }
}
