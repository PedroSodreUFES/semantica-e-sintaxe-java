package je14_java_n_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaArquivos {
    public static void main(String[] args) {
        // criar diretorio
        File diretorio = new File("./src/je14_java_n_io"); // está no diretorio atual
        if(!diretorio.exists())
            diretorio.mkdir();

        // Nova IO - Ler Arquivo
        try {
            Path path = Paths.get("/home/pedro/trabalhos/rocketseat/java/01-basico/meu-programa/src/je14_java_n_io/aula-java.txt");
            // leitura

            // ler tudo
            String conteudo = Files.readString(path);
            System.out.println(conteudo);

            // ler linha por linha
            List<String> linhas = Files.readAllLines(path); // pega um vetor de linhas
            System.out.println(linhas);
            linhas.forEach(l -> System.out.println(l));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Escrita
        try{
            Path path = Paths.get("/home/pedro/trabalhos/rocketseat/java/01-basico/meu-programa/src/je14_java_n_io/aula-java.txt");
            String conteudo = "PEDRO SODRÉ";

            // Apaga tudo no arquivo e escreve PEDRO SODRÉ
            Files.write(path, conteudo.getBytes());

            // Escrever mais de uma linha apagando o "PEDRO SODRÉ"
            List<String> nomes = new ArrayList<String>();
            nomes.add("Pedro");
            nomes.add("Vicente");
            nomes.add("Letícia");

            StringBuilder conteudoEmLinhas = new StringBuilder();
            nomes.forEach(n -> conteudoEmLinhas.append(n + "\n"));
            Files.write(path, conteudoEmLinhas.toString().getBytes());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
