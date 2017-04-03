
public class Paciente {
    double peso, altura, imc;
    String respDiag;
    public Paciente(double pesoP, double alturaP){
        peso = pesoP;
        altura = alturaP; 
        
    }
    
    public void calcularIMC(){
        imc = peso / (altura * altura);
    }    
    public void diagnosticar(){
        calcularIMC();
        
        if(imc < 16){
            respDiag="Baixo peso muito grave";
        }
        else if(imc >= 16 && imc < 17){
            respDiag="Baixo peso grave";
        }
        else if(imc >= 17 && imc < 18.50){
            respDiag="Baixo peso";
        }
        else if(imc >= 18.50 && imc < 25){
            respDiag="Peso normal";
        }
        else if(imc >= 25 && imc < 30){
            respDiag="Sobrepeso";
        }
        else if(imc >= 30 && imc < 35){
            respDiag="Obesidade grau I";
        }
        else if(imc >= 35 && imc < 40){
            respDiag="Obesidade grau II";
        }
        else{
            respDiag="Obesidade grau III (obesidade mórbida)";
        }
    }

    public double getImc() {
        return imc;
    }

    public String getRespDiag() {
        return respDiag;
    }
}
