/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes_Persistencia;

import Persistencia.TecnicoDAO;
import entidade.Tecnico;
import java.util.HashMap;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vicmc12
 */
public class TecnicoDAOTest {
    
    public TecnicoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testeDeCriarELocalizarTectico(){
        TecnicoDAO tdao = new TecnicoDAO();
        HashMap<Integer, Tecnico> tecnicos = tdao.voltaCashTecnico();
        int numeroTecnicosAntes = tecnicos.size();
        Tecnico t1 = new Tecnico("TecnicoTeste", 12345);
        tdao.put(t1);
        tecnicos = tdao.voltaCashTecnico();
        int numeroTecnicosDepois = tecnicos.size();
        Assert.assertEquals(numeroTecnicosAntes+1, numeroTecnicosDepois);
        
    }
}
