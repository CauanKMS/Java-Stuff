
public class Main {

    public static void main(String[] args) {
        Somador s1 = new Somador();
        s1.nome = "S1";
        Somador s2 = new Somador();
        s2.nome = "S2";
        Somador s3 = new Somador();
        s3.nome = "S3";

        for (int i = 0; i < 3; i++) {
            s1.Somar();
            s2.Somar();
            s3.Somar();
        }

        s2.Somar();
        
        s1.Print();
        s2.Print();
        s3.Print();
    }
}
