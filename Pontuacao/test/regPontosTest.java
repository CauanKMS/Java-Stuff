
import org.junit.Test;
import static org.junit.Assert.*;

public class regPontosTest {
    @Test
    public void pontosCriarTopico() {
        usuario u = new usuario();
        u.nome = "Birl";
        bonus b = new bonus();
        regPontos rp = new regPontos(b);
        rp.criarTopico(u);
        assertEquals(u.pontos, 5);
    }
    @Test
    public void ptsCriarTopicoVIP(){
        usuario u = new usuario();
        u.nome = "Birl";
        u.vip=true;
        bonus b = new bonus();
        regPontos rp = new regPontos(b);
        rp.criarTopico(u);
        assertEquals(u.pontos, 25);
    }
    @Test
    public void pontosCriarTopicoBonusdoDia() {
        usuario u = new usuario();
        u.nome = "Birl";
        bonus b = new bonus();
        b.bonusDiario = 3;
        regPontos rp = new regPontos(b);
        rp.criarTopico(u);
        assertEquals(u.pontos, 15);
    }
    @Test
    public void pontosCriarTopicoVipBonusdoDia() {
        usuario u = new usuario();
        u.nome = "Birl";
        u.vip = true;
        bonus b = new bonus();
        b.bonusDiario = 2;
        regPontos rp = new regPontos(b);
        rp.criarTopico(u);
        assertEquals(u.pontos, 50);
    }
}
