public class calculadora {
    //sumar
    public static int sumar(int a, int b) {
        return a + b;
    }
    //restar
    public static int restar(int a, int b) {
        return a - b;
    }
    //multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    //dividir
    public static int dividir(int a, int b) {
        return a / b;
    }
    //potencia
    public static int potencia(int a, int b) {
        return (int) Math.pow(a, b);
    }
    //raiz
    public static int raiz(int a) {
        return (int) Math.sqrt(a);
    }
    //instanciar funciones
    public static void main(String[] args) {
        System.out.println("Suma: " + sumar(2, 3));
        System.out.println("Resta: " + restar(2, 3));
        System.out.println("Multiplicacion: " + multiplicar(2, 3));
        System.out.println("Division: " + dividir(2, 3));
        System.out.println("Potencia: " + potencia(2, 3));
        System.out.println("Raiz: " + raiz(9));
    }




}
