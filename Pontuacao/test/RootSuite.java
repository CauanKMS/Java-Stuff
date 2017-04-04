/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author cauan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({regPontosTest.class, bonusTest.class, usuarioTest.class, pontuacao.PontuacaoSuite.class})
public class RootSuite {

    @Before
    public void setUp() throws Exception {
    }
    
}
