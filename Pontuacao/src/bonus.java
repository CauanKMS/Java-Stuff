
public class bonus {
    public int bonusDiario=1;
    public int bonus(usuario u){
        int multiplicador = bonusDiario;
        if(u.vip)
            multiplicador *= 5;
        return multiplicador;   
    }
}
