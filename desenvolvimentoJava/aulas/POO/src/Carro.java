//classe
class Carro extends Veiculo {
    //atributos
    String cor;
    String modelo;
    Integer tanque;

    //getters
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getTanque() {
        return tanque;
    }
    //usado para pegar, ele retorna os valores

    //setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTanque(Integer tanque) {
        this.tanque = tanque;
    }
    //usado para setar, colocar um valor em um atributo

    //dependendo de como os getters e setters são usados, eles podem ferir o encapsulamento,
    //ou seja, eles podem ferir a proteção de dados

    //métodos
    double totalvalorGasolina(double gasolina){
        return tanque * gasolina;
    }

    //construtor
    Carro(){

    }

    //construtor com sobrecarga
    Carro(String cor, String modelo, int tanque){
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
    }
    //atributo (this.cor) é diferente do parâmetro (cor)
}

class Veiculo{
    //atributos e métodos
}

//herança
class Moto extends Veiculo{

}

class Caminhao extends Veiculo{

}

