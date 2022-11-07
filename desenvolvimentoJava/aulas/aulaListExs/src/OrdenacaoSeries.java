import java.util.*;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: one piece, genero: aventura, tempoEpisodio: 25
*/


public class OrdenacaoSeries {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<ClasseSerie.Serie> minhasSeries = new HashSet<>(){{
            add(new ClasseSerie.Serie("got", "fantasia", 60));
            add(new ClasseSerie.Serie("dark", "drama", 60));
            add(new ClasseSerie.Serie("one piece", "aventura", 25));
        }};
        for (ClasseSerie.Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEp());
        //forEach pra imprimir bonitinho um em cada linha

        System.out.println("\n--\tOrdem inserção\t--");
        Set<ClasseSerie.Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new ClasseSerie.Serie("got", "fantasia", 60));
            add(new ClasseSerie.Serie("dark", "drama", 60));
            add(new ClasseSerie.Serie("one piece", "aventura", 25));
        }};
        for (ClasseSerie.Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEp());

        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--");
        Set<ClasseSerie.Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (ClasseSerie.Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEp());
        //aqui ele não vai printar got e dark, pois o tempo é igual

        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<ClasseSerie.Serie> minhasSeries3 = new TreeSet<>(new ClasseSerie.ComparatorNomeGeneroTempoEp(){
        });

        //sem esse metodo addAll, minhasSeries vai estar vazia, pois nessa inicialização da variável
        //só estamos colocando as instruções para ordenação
        //com o addAll é possível adiconar os elementos de outra collection dentro da collection atual
        minhasSeries3.addAll(minhasSeries);
        for (ClasseSerie.Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEp());
    }
}




