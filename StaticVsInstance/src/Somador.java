//This Class is gonna use an static and an instance variable
public class Somador {
    
    String nome;
    int valorInstance=0;
    static int valorStatic=0;
    
    void Somar(){
     valorInstance++;
     valorStatic++;
    }    
    
    void Print(){
        System.out.println("Somador: "+nome+" tem instancia: "+valorInstance
        + " e estatica: "+valorStatic);
    }
}
