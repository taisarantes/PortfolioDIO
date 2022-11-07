import java.util.*;
//import java.util.List;

        /*Dados as seguintes informações sobre os meus gatos, crie uma lista
        e ordene esta lista exibindo:
        (nome - idade - cor)

        gato 1 - nome: Amber, idade: 60 (meses), cor: frajola
        gato 1 - nome: Jon, idade: 18 (meses), cor: preto
        gato 1 - nome: Simba, idade: 12 (meses), cor: amarelo
         */

public class OrdenacaoGatos {
    public static void main(String[] args) {
        //quinto passo: criar a List
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Amber", 60, "frajola"));
            add(new Gato("Simba", 12, "amarelo"));
            add(new Gato("Jon", 18, "preto"));
        }};

        //sétimo passo: manipulações de ordenação + métodos
        System.out.println("Ordem de inserção:");
        System.out.println(meusGatos); //atalho criar System.out.println --> sout

        System.out.println("\nOrdem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\nOrdem natural (nome): ");
        //oitavo passo: utlizar o comparable para orgazinar os nomes
        //depois utilizar o metodo sort do collections. A List possui o metodo meusGatos.sort() para fazer a mesma coisa,
        //mas ela utiliza o comparator ao invés de comparable, que é o que foi usado aqui
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\nOrdem idade: ");
//        Collections.sort(meusGatos, new ComparatorIdade()); //forma 1
        meusGatos.sort(new ComparatorIdade()); //forma 2
        System.out.println(meusGatos);

        System.out.println("\nOrdem cor: ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/Cor/Idade: ");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

//primeiro passo criar a classe gato (sem o implements Comparable<Gato>)
//oitavo passo: utlizar o comparable para orgazinar os nomes
class Gato implements Comparable<Gato>{

    //segundo: atributos
    private String nome;
    private Integer idade;
    private String cor;

    //terceiro: criar o constructor (com alt + Insert o intellij cria sozinho)
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //terceiro: criar o getter (com alt + Insert o intellij cria sozinho) para conseguir chamar eles, pois os atributos estão privados
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //sexto: sem o toString ele vai imprimir o endereço da memória em que cada gato está
    //com o toString ele imprime os nomes, cores e idades bonitinho, com seus devidos valores
    //da pra criar ele com o alt + insert também

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //oitavo passo: utlizar o comparable para orgazinar os nomes
    @Override
    public int compareTo(Gato o) {
        //pega o nome, compara ele e retorna o int do compareTo, se o int for 0, os nomes são iguais
        //se der 1, o nome tem que ficar depois do outro nome comparado, pois ele é maior
        //se der -1, o nome comparado é menor e ficará antes.
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}


class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getNome().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0) return nome;
        //se os nomes forem diferentes, vai ordenar por nome, se não, vai pular para o próximo

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if(cor != 0) return cor;
        //se as cores forem diferentes, ordena elas, se não, vai ordenar elas pela idade

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

