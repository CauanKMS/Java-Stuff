//Provided By ITA
public class Carro {
    int potencia;
    int velocidade;
    String nome;
    
    void acelerar(){
        velocidade += potencia; //its the same of 'velocidade=velocidade + potencia'
    }
    void frear(){
        velocidade = velocidade/2;
    }
    
    int getVel(){
        return velocidade;
    }
    
    void print(){
        System.out.println("O carro "+ nome + " esta a " + getVel() + " km/h.");
    }
}
