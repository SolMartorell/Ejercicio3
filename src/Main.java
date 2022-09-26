import java.util.ArrayList;

 class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = sumatoria(2,3,4);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int sumatoria(int a, int b, int c) {
    return a + b + c;
    }
}

class Coche {
     public int puertas = 0;

    public void sumarPuertas() {
        this.puertas++;
    }
}