package sesion20250115;

public class suma {
    public static void main(String[] args) {
        System.out.println(sumar (1,2,3));
        System.out.println(sumar (1,2,3,4));
    }
    public static int sumar(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
}


/* String palabra = "Hola Mundo";
for (char c : palabra.toCharArray()) {
    System.out.println(c);
} */