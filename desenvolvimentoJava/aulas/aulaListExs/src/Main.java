import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno, faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        //criar lista:
        List<Double> notas = new ArrayList<Double>();
        //adicionar itens na lista:
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.4);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        //duas formas de imprimir: só com a variável ou com o método toString,
        //os dois printam igual

        //metodos e formas de manipular Lists:
        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d)); //retorna um booleano q diz se o elemento está ou não na List
        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem que foram informadas: ");
        for(Double nota : notas) System.out.println(nota); //forEach que imprime cada elemento um embaixo do outro

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //Exibir a soma dos valores:
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            //o hasNext é para verificar se tem algum elemento no próximo indice
            Double next = iterator.next();
            //pega o próximo numero do indice e coloca na variavel next
            soma += next;
            //soma os proximos numeros armazenados na variavel next com a variavel soma
        }
            System.out.println("\nExiba a soma dos valores: " + soma);

            System.out.println("\nExiba a media das notas: " + (soma/notas.size()));

            System.out.println("\nRemova a nota 0.0: ");
            notas.remove(0d);
            System.out.println(notas);

            System.out.println("\nRemova a nota na posição 0: ");
            notas.remove(0);
            System.out.println(notas);

            System.out.println("\nRemova as notas menores que 7: ");
            Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()){
                Double next1 = iterator1.next();
                if(next1 < 7) iterator1.remove();
            }
            System.out.println(notas);

            System.out.println("\nApague toda a lista: ");
            notas.clear();
            System.out.println(notas);

            System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

    }
}