package je15_exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Estou no bloco try!");
            throw new Exception();
        } catch(Exception ex) {
            System.err.println("Caí na exceção se ela existir!");
            ex.printStackTrace();
        } finally {
            System.out.println("Sou independente!");
        }
    }
}
