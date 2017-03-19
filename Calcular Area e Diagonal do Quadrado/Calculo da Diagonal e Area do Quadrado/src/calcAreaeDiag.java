//A lil program to determine the diagonal n area of a square
//Created by CauanKMS

import java.util.Scanner;

public class calcAreaeDiag {

    public static void main(String[] args) {
        boolean restart = true;
        while (restart) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n\n\n------------");
            System.out.println(" Bem-vindo");
            System.out.println("------------");

            System.out.println("\nPressione '1' - Calcular a Diagonal do Quadrado");
            System.out.println("Pressione '2' - Calcular a Área do Quadrado");
            System.out.println("Pressione '3' - Finalize o programa");
            System.out.print("\nComando: ");

            int dig = sc.nextInt();
            double lado_Q, diag_Q, area_Q;
            switch (dig) {
                case 1:
                    System.out.print("\n\nDigite a medida do Lado: ");
                    lado_Q = sc.nextDouble();

                    diag_Q = lado_Q * Math.sqrt(2);
                    System.out.println("\nDiagonal do Quadrado: " + diag_Q);

                    System.out.println("\nCalcular a Área do Quadrado? S/N");
                    char resp = sc.next().charAt(0);
                    if (resp == 'S') {
                        area_Q = Math.pow(lado_Q, 2);
                        System.out.print("\nÁrea do Quadrado: " + area_Q);
                        System.out.print("\n\nObrigado, \n  CauanKMS\n");
                        restart = false;
                    } else {
                        System.out.print("\n\nObrigado, \n  CauanKMS\n");
                        restart = false;
                    }
                    break;
                case 2:
                    System.out.print("\n\nDigite a medida do Lado: ");
                    lado_Q = sc.nextDouble();

                    area_Q = Math.pow(lado_Q, 2);
                    System.out.print("\nÁrea do Quadrado: " + area_Q);

                    System.out.print("\n\nObrigado, \n  CauanKMS\n");
                    restart = false;
                    break;
                case 3:
                    restart = false;
                    break;
            }
        }
    }
}
