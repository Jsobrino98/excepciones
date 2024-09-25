public class excepcion00 {
    public static void main(String[] args) {
        int a, b;
        a=5;
        b=2;
        System.out.println("Primera division: " + division(a,b));

        try {
            b = 0;
            System.out.println("Segunda division: " + division(a, b));

        }catch (Exception e){
            System.out.println("ERROR, no se puede dividir por cero");
        }

        b=3;
        System.out.println("Tercera division: " + division(a,b));

    }
    public static int division( int a, int b){
        return a/b;
    }
}
