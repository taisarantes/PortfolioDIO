import java.util.*;

import static javax.swing.UIManager.put;

public class ExemploMap {
    public static void main(String[] args) {
    /* Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
    Modelo = gol - consumo = 14,4km/l
    Modelo = uno - consumo = 15,6km/l
    Modelo = mobi - consumo = 16,1km/l
    Modelo = hb20 - consumo = 14,5km/l
    Modelo = kwid - consumo = 15,6km/l */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos.");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4); //no Map ao invés de add temos que usar o metódod put
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Confira se o modelo kwid está no dicionário: " + carrosPopulares.containsKey("kwid"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("Exiba o terceiro modelo adiconado: "); //não é possível manipular indices com MAP

        System.out.println("\nExiba os modelos: ");
//        carrosPopulares.keySet(); --> esse método retorna um Set, então temos que criar uma variável do tipo Set para retornar o valor
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba o consumo dos carros: ");
//        carrosPopulares.values(); --> já esse método retorna uma Collection
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
//        carrosPopulares.entrySet(); // --> método para trabalhar com Key e Value de forma separada
        //esse método retorna um Set do tipo Entry
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente = " + modeloMaisEficiente + " -> " + consumoMaisEficiente);
            }

        }

        System.out.println("\nExiba o modelo menos eficiente e seu consumo: ");
        String modeloMenosEficiente = " ";
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)) {
                //se o valor do entry for igual à variável consumo menos eficiente, a chave ligada com esse valor também é o menos eificente,
                //portanto esse vlaor vai ser armazenado em modelo menos eficiente
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente = " + modeloMenosEficiente + " -> " + consumoMenosEficiente);
            }
        }

//        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma dos consumos: " + soma);


        System.out.println("\nExiba a média dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("\nRemova os modelo com consumo igual à 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6))
                iterator1.remove();
        }
//        carrosPopulares.values().removeIf(aDouble -> aDouble.equals(15.6)); //--> sugestão do intellij para fazer a mesma coisa que o Iterator
        System.out.println(carrosPopulares);

        System.out.println("\nExiba os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
