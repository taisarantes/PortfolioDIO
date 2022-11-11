import java.util.*;
import java.util.function.Function;

/* Dados as seguintes informações de id e contato, crie um dicionário e
ordene o dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, ClasseContato.Contato> agenda = new HashMap<>(){{
            put(1, new ClasseContato.Contato("Simba", 2222));
            put(4, new ClasseContato.Contato("Cami", 5555));
            put(3, new ClasseContato.Contato("Job", 1111));
        }};
        System.out.println(agenda);
        for(Map.Entry<Integer, ClasseContato.Contato> entry : agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem de inserção\t--");
        Map<Integer, ClasseContato.Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new ClasseContato.Contato("Simba", 2222));
            put(4, new ClasseContato.Contato("Cami", 5555));
            put(3, new ClasseContato.Contato("Job", 1111));
        }};
        System.out.println(agenda);
        for(Map.Entry<Integer, ClasseContato.Contato> entry : agenda1.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, ClasseContato.Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for(Map.Entry<Integer, ClasseContato.Contato> entry : agenda2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem numero telefone\t--");
        //sem classe anonima:
//        Set<Map.Entry<Integer, ClasseContato.Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        //com classe anonima:
//        Set<Map.Entry<Integer, ClasseContato.Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, ClasseContato.Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, ClasseContato.Contato> o1, Map.Entry<Integer, ClasseContato.Contato> o2) {
//                return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
//            }
//        });
        //com metodo estatico do comparator:
//        Set<Map.Entry<Integer, ClasseContato.Contato>> set = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer,ClasseContato.Contato>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, ClasseContato.Contato> o) {
//                        return o.getValue().getNumero();
//                    }
//                }));
        //simplificar classe anonima com lambda:
        Set<Map.Entry<Integer, ClasseContato.Contato>> set = new TreeSet<>(Comparator.comparing(
                o -> o.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer, ClasseContato.Contato> entry : set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer, ClasseContato.Contato>> set1 = new TreeSet<>(new ComparatorOrdemNome());
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer, ClasseContato.Contato> entry : set1){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        }
    }

    //como foi usada uma classe anonima na linha 46, esse código foi levado para lá como classe anonima:
//    class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, ClasseContato.Contato>>{
//
//    @Override
//    public int compare(Map.Entry<Integer, ClasseContato.Contato> o1, Map.Entry<Integer, ClasseContato.Contato> o2) {
//        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
//    }
//}
    class ComparatorOrdemNome implements Comparator<Map.Entry<Integer, ClasseContato.Contato>>{

    @Override
    public int compare(Map.Entry<Integer, ClasseContato.Contato> o1, Map.Entry<Integer, ClasseContato.Contato> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}