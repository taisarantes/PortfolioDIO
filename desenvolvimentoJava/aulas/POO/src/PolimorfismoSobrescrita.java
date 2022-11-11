public class PolimorfismoSobrescrita {
    public static void main(String[] args) {
        //vetor do tipo ClasseMae que possui ClasseFilha1, 2 e Mae como objetos
        //polimorfismo
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //polimorfismo
        for (ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        //não possui polimorfimso, pois em ClasseFilha1 não há metodo2
        for (ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        //sobrescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
