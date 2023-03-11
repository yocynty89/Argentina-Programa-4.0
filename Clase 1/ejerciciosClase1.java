import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 5, num2 = 14;

        System.out.println("*********************PUNTO 1***********************");
        System.out.println("PUNTO A)");
        while (num1 <= num2) {
            System.out.println(num1);
            num1 = num1 + 1;
        }
        System.out.println("-----------------------------------");
        System.out.println("PUNTO B)");
        num1 = 4;
        while ((num1 <= num2)) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1 = num1 + 1;
        }

        System.out.println("-----------------------------------");
        System.out.println("PUNTO C)");
        System.out.println("INGRESE 1 PARA VER LOS NUMEROS PARES 0 2 PARA VER LOS NUMEROS IMPARES");
        //aqui falta tomar el caracter que ingrese el usuario
        int opc;                                   //creo variable para darle nombre a lo que ingresa el usuario
        Scanner leer = new Scanner(System.in);       //creo la variable que va a tomar lo que ingresa el usuario
        opc = leer.nextInt();                         //le asigno a opc el valor de lo que ingreso el usuario
        switch (opc) {
            case 1:
                num1 = 4;
                while ((num1 <= num2)) {
                    if (num1 % 2 == 0) {
                        System.out.println(num1);
                    }
                    num1 = num1 + 1;
                }
                break;
            case 2:
                num1 = 4;
                while ((num1 <= num2)) {
                    if (num1 % 2 != 0) {
                        System.out.println(num1);
                    }
                    num1 = num1 + 1;
                }
                break;
            default:
                System.out.println("OPCION INCORRECTA!!)");
                // return;
        }
        System.out.println("-----------------------------------");
        System.out.println("PUNTO D)");
        num1 = 4;
        for (int i = num2; i >= num1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("*********************PUNTO 2***********************");
        System.out.println("PUNTO D)");
        int ingTotales=500000;
        int cantVehiculos=3;
        int cantInmuebles=3;
        boolean lujoActivos=true;

        if ( (ingTotales >=489083 ) &&
                ( cantVehiculos >= 3) &&
                (cantInmuebles >= 3) &&
                (lujoActivos == true) ) {
            System.out.println("Categoría i");
        }

    }
}

