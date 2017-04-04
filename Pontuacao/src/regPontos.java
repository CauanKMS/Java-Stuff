
public class regPontos {
    
    private bonus bo;
    
    public regPontos(bonus b){
        bo = b;
    }
    
    public void fazerComentario(usuario u /*this var comes from 'usuario' Class*/){
        u.pontos+=3* bo.bonus(u);
    }
    public void criarTopico(usuario u){
        u.pontos+=5* bo.bonus(u);
    }
    public void like(usuario u){
        u.pontos +=1* bo.bonus(u);
    } 
}
