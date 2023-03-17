public class ItemCarrito {
    public Producto producto;
    public int cantidad;
    public int subtotal=1;
/**********************************************gets****************************************/
    public Producto getItem() {return producto;    }
    public int getCantidad() { return cantidad;    }

    public int getSubtotal() { return subtotal; }

    /************************************sets************************************************/
    public void setItem(Producto item) {   this.producto = item;}

    public void setCantidad(int cantidad) { this.cantidad = cantidad;  }

    public void setSubtotal(int subtotal) { this.subtotal = subtotal;}
    /********************************************************************************************/

    public ItemCarrito(int cant){
        this.cantidad=cant;
     //  this.subtotal= cant * (producto.getPrecio());

    }
}
