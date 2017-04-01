
import org.junit.Test;
import static org.junit.Assert.*;

public class CompraTest {
    
    public CompraTest() {
    }
    @Test
    public void CompraAVista() {
        Compra c = new Compra(500);
        assertEquals(1, c.getQtd_parcelas());
        assertEquals(500, c.getValorTotal());
        assertEquals(500, c.getValorParc());
    }
    @Test
    public void CompraPrazo(){
        Compra c =new Compra(4,250);
        assertEquals(4, c.getQtd_parcelas());
        assertEquals(1000, c.getValorTotal());
        assertEquals(250, c.getValorParc());
    }
}
