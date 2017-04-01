
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Carro c = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Scanner sc = new Scanner(System.in);
        c.potencia = 1000;
       //System.out.print("Digite o nome do teu carro:"); 
        c.nome = "Gol 1000"; //- Isso para padrao pre-definido
       //c.nome = sc.next(); - Isso para valores do Usuario
        c.velocidade = 0;
        
        c2.potencia = 20;
        c2.nome ="Brasilia Amarela";
        c2.velocidade = 0;
        
        c3.potencia=100;
        c3.nome="Monza";
        c3.velocidade=10;
                
        c.acelerar();
        c.acelerar();
        c.acelerar();        
        c.frear();
        
        c2.acelerar();
        
        c.print();
        c2.print();
        
        System.out.println("\nPrintando c3");
        c3.print();
    }
}
