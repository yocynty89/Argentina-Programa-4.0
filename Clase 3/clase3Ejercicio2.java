public class clase3Ejercicio2 {
    public static void main(String[] args) {
    //Genere una clase que tenga los métodos para realizar la codificación y decodificación
    //de un string, dado un número de desplazamiento.
                String palabra="hola que tal";
                int desplazamineto=1;
                String codificado="";
                String decodificado="";
                int cantCaracteres=palabra.length();
                String abecedario=" abcdefghijklmnñopqrstuvwxyz";
                char letra,letraAbc;
                int cantCaracteresAbc=abecedario.length();



                for( int i = 0;
                     i<cantCaracteres;i++){
                    letra=palabra.charAt(i);//accede a cada uno de las letras


                    for (int x = 0; x < cantCaracteresAbc; x++) {

                        letraAbc=abecedario.charAt(x) ;

                        if(letra==letraAbc){
                            letraAbc=abecedario.charAt(x+desplazamineto);

                            codificado= codificado+ codificado.valueOf(letraAbc);
                        }
                    }

                }
                System.out.println(codificado);

        for( int i = 0;
             i<cantCaracteres;i++){
            letra=codificado.charAt(i);//accede a cada uno de las letras


            for (int x = 0; x < cantCaracteresAbc; x++) {

                letraAbc=abecedario.charAt(x) ;

                if(letra==letraAbc){
                    letraAbc=abecedario.charAt(x-desplazamineto);

                    decodificado= decodificado+ decodificado.valueOf(letraAbc);
                }
            }

        }
        System.out.println(decodificado);
            }}


