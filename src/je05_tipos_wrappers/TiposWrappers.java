package je05_tipos_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        // conversão implícita
        double n = 123.99;
        int nint = (int) n;
        System.out.println(nint);

        // conversão explícita
        Double n2 = 100.99;
        Integer nint2 = n2.intValue();
        System.out.println(nint2);

        // vantagem em escrita
        String word = "1000";
        Integer n3 = Integer.parseInt(word);
        System.out.println(n3 + 1);
    }
}
