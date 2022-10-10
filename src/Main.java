public class Main {
    public static void main(String[] args) {
        //Parte 1
        int resSuma = suma(5, 5,5);
        System.out.println(resSuma);

        //Parte 2
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();

        System.out.println(miCoche.puertasCoche);
    }
    //Funcion de 3 parametros - Parte 1 - ejercicio tema 3
    public static int suma (int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        return resultado;
    }
}
//clase Coche aumentar puertas del coche - Parte 2 - ejercicio tema 3

class Coche{
    public int puertasCoche = 4;

    public void aumentarPuertas(){
        this.puertasCoche++;
    }
}