public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("FOR 1");
        for(int numero = 1; numero <=5; numero++) {
            if(numero == 3) {
                break;
            }
            System.out.println(numero);
        }

        System.out.println("FOR 2");

        for(int numero = 1; numero <=5; numero++) {
            if(numero == 3) {
                continue;
            }
            System.out.println(numero);
        }
    }
}
