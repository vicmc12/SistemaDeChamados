/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes_Persistencia;

import Persistencia.EmpresaDAO;
import entidade.Empresa;
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
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
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
    public void testeDeCriarELocalizarEmpresa() {
        EmpresaDAO edao= new EmpresaDAO();
        Empresa e1 = new Empresa(4321, "EmpresaTeste");
        edao.put(e1);
        Assert.assertTrue(edao.getEmpresas().contains(e1));
    }
}
