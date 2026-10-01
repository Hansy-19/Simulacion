public class Sumatorias {

    int [] x = {1, 2, 3, 4, 5};

   int [] y = {3, 5, 7, 9, 11};

   public Sumatorias(){
   }

    public int cantidadX() {
        return x.length;
    }

    public int sumarX() {
        int suma = 0;
        for (int valor : x) {
            suma += valor;
        }
        return suma;
    }

    public int sumarY() {
        int suma = 0;
        for (int valor : y) {
            suma += valor;
        }
        return suma;
    }

    public int[] XCuadrada() {
        int[] resultado = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            resultado[i] = x[i] * x[i];
        }
        return resultado;
    }

    public int sumarXCuadrada() {
        int sumaTotal = 0;
        for (int valor : x) {
            sumaTotal += (valor * valor);
        }
        return sumaTotal;
    }

    public int sumarXPorY() {
        int sumaTotal = 0;
        for (int i = 0; i < x.length; i++) {
            sumaTotal += (x[i] * y[i]);
        }
        return sumaTotal;
    }

}
