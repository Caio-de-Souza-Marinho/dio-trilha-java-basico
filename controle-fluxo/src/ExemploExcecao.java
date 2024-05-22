// import java.text.NumberFormat;
// import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {

        /*Unchecked Exception
        valueOf -> throw NumberFormatException: a aplicação tentou converter uma 
        string para um dos tipos numéricos mas a string nao tem o formato apropriado
        NumberFormatException extends IllegalArgumentException: indica que um método usou um argumento ilegal ou inapropriado
        IllegalArgumentException extends RuntimeException: jvm detecta que pode ser um erro nao tao recorrente

        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);
        */
        
        /*Transformando o código anterior em Checked Exception
        // parse() -> throw ParseException: um erro aconteceu ao fazer parse
        ParseException extends Exception: indica erros comuns que podem acontecer

        
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */
    }
}
