public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
/*********************************gets*****************/
    public int getCodigo() { return codigo; }
    public int getPrecio() {return precio;}
    public String getNombre() {return nombre;}
/**********************************sets****************/
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public void setNombre(String nombre) {this.nombre = nombre; }

    public void setPrecio(int precio) { this.precio = precio; }


    /* CREAR ALGUNOS CONSTRUCTOR CON AZUCAR, LECHE Y PURE DE TOMATE*/

/**********************************metodos**************************/

public Producto(String nombre,int cod,int pre){
    this.nombre=nombre;
    this.codigo=cod;
    this.precio=pre;

}
}
