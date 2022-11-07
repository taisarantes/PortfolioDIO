import java.util.Objects;

public class ClasseLivro {
    static class Livro{
        private String nome;
        private Integer paginas;

        //constructor
        public Livro(String nome, Integer paginas) {
            this.nome = nome;
            this.paginas = paginas;
        }

        //getters
        public String getNome() {
            return nome;
        }

        public Integer getPaginas() {
            return paginas;
        }

        //equals e hashcode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Livro livro = (Livro) o;
            return nome.equals(livro.nome) && paginas.equals(livro.paginas);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, paginas);
        }

        //metodo toString
        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", paginas=" + paginas +
                    '}';
        }
    }
}
