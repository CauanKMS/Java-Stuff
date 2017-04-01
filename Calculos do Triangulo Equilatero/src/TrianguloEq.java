//Calculos de Altura e Area do Triangulo EQUILATERO, tomando por base os lados
//  desse Triangulo.
//Created by Cauan.KMS
import java.util.Scanner;
public class TrianguloEq {    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){ 
    System.out.println("~~CALCULOS DO TRIANGULO EQUILATERO~~");
    System.out.println("\nDigite '1' - Cálculo da Altura");
    System.out.println("Digite '2' - Cálculo da Área");
    System.out.print("\nO que fazer? ");
    int dig = sc.nextInt();
    
    switch(dig){
        case 1:
            System.out.println("\nDigite a medida do LADO:");
            double lado_T = sc.nextDouble();
            
            double alt_T = (lado_T * Math.sqrt(3))/2;
            System.out.println("\nA Altura desse Triângulo é: " + alt_T);
            
            System.out.println("\nCalcular a Área? S/N");
            String s_n = sc.next();
            
            if(s_n.equals("S")){
                double baseshow = ((Math.pow(lado_T,2)*Math.sqrt(3))/4);
                System.out.println("A Área do Triângulo é: "+baseshow);
            }
            else if(s_n.equals("N")){
            System.out.println("\nObrigado por usufruir do meu magnânimo programa :)");
            }
            else {System.out.println("ERRO");}
            
            break;
        case 2:
            System.out.println("\nDigite a medida do LADO:");
            double lado_T2 = sc.nextDouble();
            
            double area_T = ((Math.pow(lado_T2, 2))*Math.sqrt(3))/4;
            System.out.println("\nA Área desse Triângulo é: " + area_T);
            break;
        default: 
            System.out.println("Digite somente os números indicados!");
    }
    }
}
