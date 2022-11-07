import java.util.Comparator;
import java.util.Objects;

public class ClasseSerie {
    static class Serie implements Comparable<Serie>{
        private String nome;
        private String genero;
        private Integer tempoEp;

        public Serie(String nome, String genero, Integer tempoEp) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEp = tempoEp;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEp() {
            return tempoEp;
        }

        @Override
        public String toString() {
            return "Serie{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEp=" + tempoEp +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEp.equals(serie.tempoEp);
        }
        //verifica se o objeto que eu estou pesquisando possui o hashcode dentro da minha classe

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEp);
        }
        //diz o tipo de comparação que eu quero, que é por nome, genero e tempo de episodio

        @Override
        public int compareTo(Serie o) {
            int tempoEpisodio =  Integer.compare(this.getTempoEp(), o.getTempoEp());
            if(tempoEpisodio != 0) return tempoEpisodio;

            return this.getGenero().compareTo(o.getGenero());
            //se colocar só essa linha de cima, que é o necessário para fazer a comparação, ele não
            //vai imprimir got e dark porque o tempo delas é igual
        }
    }

    //comparar nome, genero e tempo de ep
    static class ComparatorNomeGeneroTempoEp implements Comparator<Serie> {

        @Override
        public int compare(ClasseSerie.Serie o1, ClasseSerie.Serie o2) {
            int nome = o1.getNome().compareTo(o2.getNome());
            if(nome != 0) return nome;

            int genero = o1.getGenero().compareTo(o2.getGenero());
            if(genero != 0) return genero;

            return Integer.compare(o1.getTempoEp(), o2.getTempoEp());
        }
    }
}


