public class Descuento {
    private int descuentoJubilados = 10;
    private int descuentoEmpleados = 5;

    /*****************************************gets************************************/
    public int getDescuentoEmpleados() {
        return descuentoEmpleados;
    }

    public int getDescuentoJubilados() {
        return descuentoJubilados;
    }

   public void dtoJubilado(int total){
        int totalFinal=total-(total*descuentoJubilados/100);
        System.out.println("EL MONTO FINAL DE SU COMPRA ES: $"+totalFinal);
   };
    public void dtoEmpleado(int total){
        int totalFinal=total-(total*descuentoEmpleados/100);
        System.out.println("EL MONTO FINAL DE SU COMPRA ES: $"+totalFinal);
    };
}
