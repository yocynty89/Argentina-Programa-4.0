import java.util.Scanner;
public  class Calculadora {
    private double resultado;
    double  sumar(double unNumero, double otroNumero) {
           resultado= unNumero+otroNumero;
        return resultado;
    }

    double restar(double unNumero, double otroNumero) {
        resultado= unNumero-otroNumero;
        return resultado;
    }

    double multiplicar(double unNumero, double otroNumero) {
        resultado= unNumero*otroNumero;
        return resultado;
    }

    double dividir(double unNumero, double otroNumero) {
        resultado= unNumero/otroNumero;
        return resultado;
    }

    public static void main(String[] args) {

        System.out.println("Ingrese un numero: ");
       Scanner leer=new Scanner(System.in);
    double num1=leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        Scanner leer1=new Scanner(System.in);
      double num2=leer1.nextInt();
        System.out.println("Ingrese la operacion: +)suma -)resta *)multiplicacion /)division ");
        Scanner leerSigno=new Scanner(System.in);
        char signo= leerSigno.next().charAt(0);// para obtener un caracter del teclado

        switch (signo){
            case '+' :
             Calculadora mostrar=new Calculadora();
                System.out.println("RESULTADO= "+mostrar.sumar(num1,num2));
                break;
            case '-': Calculadora mostrarResta=new Calculadora();
                System.out.println("RESULTADO= "+mostrarResta.restar(num1,num2));
                break;
            case'*': Calculadora mostrarMultiplicacion=new Calculadora();
                System.out.println("RESULTADO= "+mostrarMultiplicacion.multiplicar(num1,num2));
                break;
            case '/': Calculadora mostrarDivision=new Calculadora();
                System.out.println("RESULTADO= "+mostrarDivision.dividir(num1,num2));
                break;
            default:  System.out.println("operacion incorrecta!!"); ;
        }





    }
}