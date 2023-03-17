public class Carrito {
    private ItemCarrito producto;
    private Descuento descuento;
    private int total;
/***********************************************gets*****************************************/
    public int getTotal() { return total;    }
    public Descuento    getDescuento() {return descuento;    }
    public ItemCarrito getProduc() {return producto; }
/**********************************************sets***********************************************/
    public void setDescuento(Descuento descuento) {this.descuento = descuento; }
    public void setProduc(ItemCarrito produc) {this.producto = produc;  }
    public void setTotal(int total) { this.total = total;}

/*************************************************************metodos**************************************/

}
