//In this screen, the program will verify how much the user spent and charge him
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua compra:");
        int valorUser = sc.nextInt();
        System.out.println("\nDeseja parcelar? S/N");
        String decisao = sc.next();
        
        if(decisao.equals("S")){
            System.out.println("\nEm quantas vezes?");
            int n_parc = sc.nextInt(); int valor_Parc = valorUser/n_parc;
            Compra c = new Compra(n_parc,valor_Parc);
            System.out.println("\nO valor parcelado eh de: R$" +valor_Parc);
        }
        else{
            Compra c = new Compra(valorUser);
            System.out.println("\nO valor eh de: R$" + c.getValorTotal());
            System.out.println("Voce e o bichao msm");
        }
    }
}
