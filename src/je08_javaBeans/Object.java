package je08_javaBeans;

public class Object {
    public static void main(String[] args) {
        Beans sodras = new Beans("Sodras", 18);
        sodras.setIdade(20);
        System.out.println(sodras.getIdade());
        System.out.println(sodras.getNome());
    }
}
