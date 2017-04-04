
public class Main {

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.bim1 = 70;
        a.bim2 = 40;
        a.bim3 = 80;
        a.bim4 = 70;

        //System.out.println(VerificaNotas.mediaAluno(a));
        //System.out.println(VerificaNotas.aprovacao(a));
        System.out.println(a.media());
        System.out.println(a.aprovacao());
    }
}
