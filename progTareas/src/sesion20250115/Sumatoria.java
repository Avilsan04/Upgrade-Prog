package sesion20250115;

public class Sumatoria {
    public static void main(String[] args) {
        System.out.println(suma(1000));
    }
    public static int suma(int n){
        if(n < 0) return -1;
        if(n == 0) return 0;
        return n + suma(n-1);
    }
}
