package sesion20250115;

public class factorial {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("el factorial de " + numero +" es " + factorial(numero));

    }
    public static int factorial(int n) {
        if(n < 0) return -1;
        if(n == 1 || n == 0) return 1;
        return n*factorial(n-1);

    }
}
