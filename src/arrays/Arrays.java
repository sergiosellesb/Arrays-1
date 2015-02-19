package arrays;

/**
 *
 * @author Jordi
 * @version 1.0
 */
import java.util.Scanner;

public class Arrays {

    public static void inicializar(int a[]) {
        Scanner teclado = new Scanner(System.in);
        int tam, i;
        tam = a.length;
        for (i = 0; i < tam; i++) {
            System.out.println("Dime el elemento "+ (i+1));
            a[i] = teclado.nextInt();
        }

    }

    public static void imprimir(int a[]) {

        int tam, i;
        tam = a.length;
        for (i = 0; i < tam-1; i++) {
            System.out.print(a[i]);
            System.out.printf(", ");
        }
        
        System.out.println(a[i]+".");
    }

    public static int maximo(int a[]) {

        int tam, i, max;
        tam = a.length;
        max = a[0];
        for (i = 1; i < tam; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minimo(int a[]) {

        int tam, i, min;
        tam = a.length;
        min = a[0];
        for (i = 1; i < tam; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;

    }

    public static boolean iguales(int a[], int a2[]) {

        int tam, tam2, i;
        boolean iguales = true;
        tam = a.length;
        tam2 = a2.length;
        if (tam != tam2){
            iguales = false;
        }
        else{
            for (i = 0; i < tam; i++) {
                if (a[i] != a2[i]) {
                    iguales = false;
                    break;
                }
            }
        }
        return iguales;
    }

    public static boolean polindromo(int a[]) {

        int tam, i, mitad;

        boolean polindromo = true;
        tam = a.length;
        int j = tam - 1;
        mitad = tam / 2;
        for (i = 0; i < mitad; i++) {
            if (a[i] != a[j]) {
                polindromo = false;
                break;
            }
            j--;
        }
        return polindromo;
    }

    public static void ordenar(int a[]) {

        int tam, i, j, varaux;
        tam = a.length;
        for (i = 1; i < tam; i++) {
            for (j = 0; j < tam - i; j++) {
                if (a[j] > a[j + 1]) {
                    varaux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = varaux;
                }
            }
        }
    }

    public static double media(int a[]) {
        Scanner teclado = new Scanner(System.in);
        int tam, i, total = 0;
        double media;
        tam = a.length;
        for (i = 0; i < tam; i++) {
            total = total + a[i];
        }
        media = (double) total / (double) tam;
        return media;
    }

    public static int[] copiar(int a[], int v[]) {

        int tam, i;
        tam = a.length;  
        for (i = 0; i < tam; i++) {
            v[i] = a[i];
        }

        return v;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int t, t2, op, varaux;
        int array[];
        System.out.println("Tamaño del array?");
        t = teclado.nextInt();
        array = new int[t];

        do {
            do {
                System.out.println("Menu");
                System.out.println("1-Inicializar");
                System.out.println("2-Imprimir");
                System.out.println("3-Maximo");
                System.out.println("4-Minimo");
                System.out.println("5-Iguales");
                System.out.println("6-Polindromo");
                System.out.println("7-Ordenar");
                System.out.println("8-Media");
                System.out.println("9-Copiar");
                System.out.println("10-Salir");
                op = teclado.nextInt();
            } while (op > 10 || op < 1);

            switch (op) {

                case 1:
                    Arrays.inicializar(array);
                    break;
                case 2:
                    Arrays.imprimir(array);
                    break;
                case 3:
                    varaux = Arrays.maximo(array);
                    System.out.println("maximo es: " + varaux);
                    break;
                case 4:
                    varaux = Arrays.minimo(array);
                    System.out.println("minimo es : " + varaux);
                    break;
                case 5:
                    System.out.println("Tamaño del 2º array?");
                    t2 = teclado.nextInt();
                    int a2[] = new int[t2];
                    Arrays.inicializar(a2);
                     if(Arrays.iguales(array, a2)){
                        System.out.println("Si son iguales");
                                                    }
                    else {
                       System.out.println("No son iguales"); 
                    }
                    break;
                case 6:
                        if(Arrays.polindromo(array)){
                        System.out.println("Si es polindromo");
                                                    }
                    else {
                       System.out.println("No es polindromo"); 
                    }
                    break;
                case 7:
                    Arrays.ordenar(array);
                    Arrays.imprimir(array);
                    break;
                case 8:
                    System.out.println("La media es: "+Arrays.media(array));
                    break;
                case 9:

                    int[] v = new int[t];
                    Arrays.copiar(array, v);
                    Arrays.imprimir(v);
                    break;
                case 10:
                    break;

            }
System.out.println(" ");
        } while (op != 10);

    }

}
