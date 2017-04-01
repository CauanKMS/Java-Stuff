
public class Compra {
    int valorTotal; int qtd_parcelas;
    
    public Compra(int valor){
    //a vista
    valorTotal = valor;
    qtd_parcelas =1;
    }
    
    public Compra(int qtdParc, int valorParc){
        //a prazo
        qtd_parcelas= qtdParc;
        valorTotal = valorParc * qtdParc;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }
    
    public int getValorParc(){
        return valorTotal/qtd_parcelas;
    }
}
