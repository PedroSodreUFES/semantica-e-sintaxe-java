package je07_javadoc;

/**
 * Calculadora do Sodras
 * @author Pedro Sodré Malini
 * @version v.25.0.1
 * */
public class Calculadora {
    /**
     * Realiza a divisão entre dois números inteiros.
     * @param dividendo Número que será dividido.
     * @param divisor Número que irá dividir o dividendo.
     * @return O resultado da divisão entre o dividendo e o divisor.
     * @author Pedro Sodré.
     * @exception java.lang.ArithmeticException em caso de divisor ser zero.
     */
    static Integer dividir(Integer dividendo, Integer divisor){
        return dividendo / divisor;
    }
}