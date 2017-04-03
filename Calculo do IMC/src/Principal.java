
public class Principal {

    public static void main(String[] args) {
        Paciente p1 = new Paciente(60, 1.70);
        Paciente p2 = new Paciente(130, 1.82);
        Paciente p3 = new Paciente(40, 1.45);
        
        p1.diagnosticar();
        p2.diagnosticar();
        p3.diagnosticar();
        
        System.out.println("O Paciente 1 tem IMC: "+ p1.getImc() + ", e seu Diagnóstico é: " + p1.getRespDiag());
        System.out.println("\nO Paciente 2 tem IMC: "+ p2.getImc() + ", e seu Diagnóstico é: " + p2.getRespDiag());
        System.out.println("\nO Paciente 3 tem IMC: "+ p3.getImc() + ", e seu Diagnóstico é: " + p3.getRespDiag());
    }
}
