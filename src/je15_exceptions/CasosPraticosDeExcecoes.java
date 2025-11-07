package je15_exceptions;

import java.text.NumberFormat;
import java.text.ParseException;

public class CasosPraticosDeExcecoes {
    public static void main(String[] args) {
        // divisão por zero
        try {
            Double valor = (double) (100/0);
            System.out.println(valor);
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Bloco finally!");
        }

        // formatação
        try {
            Number valor = NumberFormat.getCurrencyInstance().parse("a1.75");
            System.out.println(valor);
        } catch(ParseException ex) {
            ex.printStackTrace();
        }

        try {
            checkEstado("PI");
        }
        // ABSORVIÇÕES DE EXCEPTIONS DEVEM PARTIR DE MENOS ABRANGENTES PARA MASI ABRANGENTES
        catch (EstadoValidateException ex) {
            ex.printStackTrace();
        } catch (Exception ex2) {
            ex2.printStackTrace();
        }
    }

    static void checkEstado(String nomeEstado) throws EstadoValidateException, Exception {
        if(nomeEstado.equals("FL"))
            throw new Exception("Esse estado não consta no Brasil");
        if(!nomeEstado.equals("PI")) {
            throw new EstadoValidateException();
        }
        System.out.println("Bem-vindo ao: " + nomeEstado);
    }

}
