public class ForArrays {
    public static void alunos(){
        String alunos[] = {"Tais", "Arthur", "Ricardo", "Luan", "Davi"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é: " + alunos[x]);
        }
    }

    public static void alunos2(){
        String alunos[] = {"Tais", "Arthur", "Ricardo", "Luan", "Davi"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        //a cada execução, a varaivel aluno vai obter um novo valor e vai atualizar o indice de forma automatica
        //atualizando o valor de aluno para cada elemento da array alunos
    }
}
