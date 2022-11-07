import java.util.*;

/*Dado as seguintes informações sobre meus livros favortos e seus autores,
  crie um dicionário e orde esse dicionário:
  exibindo (Nome Autor - Nome Livro)

  Autor = Hawking, Stephen  -Livro = nome: Uma breve história do tempo. Paginas: 256
  Autor = Duhigg, Charles  -Livro = nome: O poder do Hábito. Paginas: 408
  Autor = Harari, Yuval Noah  -Livro = nome: 21 lições para o século 21. Paginas: 432
*/


public class OrdenacaoLivros {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, ClasseLivro.Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new ClasseLivro.Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new ClasseLivro.Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new ClasseLivro.Livro("21 lições para o século 21", 432));
        }};
        for(Map.Entry<String, ClasseLivro.Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("\n--\tOrdem inserção\t--");
        Map<String, ClasseLivro.Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new ClasseLivro.Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new ClasseLivro.Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new ClasseLivro.Livro("21 lições para o século 21", 432));
        }};
        for(Map.Entry<String, ClasseLivro.Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String, ClasseLivro.Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for(Map.Entry<String, ClasseLivro.Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("\n--\tOrdem alfabética livros\t--");
        //inicializa a comparação:
        Set<Map.Entry<String, ClasseLivro.Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        //adicona os itens das lista para eles serem comparados:
        //(sem esse método a lista fica vazia)
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, ClasseLivro.Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tOrdem número de páginas\t--");

    }
}

class ComparatorNome implements Comparator<Map.Entry<String, ClasseLivro.Livro>>{

    //implementação dos metodos:
    @Override
    public int compare(Map.Entry<String, ClasseLivro.Livro> l1, Map.Entry<String, ClasseLivro.Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
        //l1 (livro 1) pega o Value (nome é um Value, não uma Key) e o nome, que é o que eu quero comparar,
        //usa o compareTo, para comparar o l1 com o l2 (livro2), que também precisa pegar Value e nome.
    }
}
