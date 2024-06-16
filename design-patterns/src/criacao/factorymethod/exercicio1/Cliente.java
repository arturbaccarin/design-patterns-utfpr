package criacao.factorymethod.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {
        List<NomeCompleto> nomes = new ArrayList<>();

        Factory nomeSobrenomeFactory = new NomeSobrenomeFactory();
        Factory sobrenomeNomeFactory = new SobrenomeNomeFactory();

        NomeCompleto nome;

        nome = sobrenomeNomeFactory.criarNome("McNealy, Scott");
        nomes.add(nome);

        nome = nomeSobrenomeFactory.criarNome("James Gosling");
        nomes.add(nome);

        nome = sobrenomeNomeFactory.criarNome("Naughton, Patrick");
        nomes.add(nome);

        for (NomeCompleto n : nomes) {
            System.out.println(n);
        }
    }
}
