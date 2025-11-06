package je10_POO;

import je10_POO.enums.EstadoBrasileiro;

public class Sistema {
    public static void main(String[] args) {
        // classes
        Cliente sodras = new Cliente("Sodras", 200.0 );
        System.out.println(sodras.nome + " " + sodras.limiteCredito);
        sodras.comprar(50.0);

        Cliente lele = new Cliente("Letícia linda", 500.0);
        System.out.println(lele.nome + " " + lele.limiteCredito);
        lele.comprar(300.0);

        System.out.println("Limite do Sodras é: " + sodras.limiteCredito);
        System.out.println("Limite da Lele é: " + lele.limiteCredito);

        // enums
        // instanciar
        EstadoBrasileiro rj = EstadoBrasileiro.RIO_DE_JANEIRO;
        System.out.println(rj.getNome());
        System.out.println(rj.getSigla());
        System.out.println(rj.name() + "\n");

        // pegar todos os valores do enum é possivel
        for(EstadoBrasileiro eb: EstadoBrasileiro.values()) {
            System.out.println(eb.getNome());
        }

        // Comparação com .equals
        Carro carro1 = new Carro("vermelho", "Peugeot", "208");
        Carro carro2 = new Carro("vermelho", "Peugeot", "208");
        Carro carro3 = new Carro("branco", "BYD", "Dolphin");

        System.out.println(carro1 == carro2); // falso por referencia
        System.out.println(carro1.equals(carro2)); // verdadeiro por campos
        System.out.println(carro1 == carro3); // falso por referencia
        System.out.println(carro1.equals(carro3)); // falso por campos
    }
}
