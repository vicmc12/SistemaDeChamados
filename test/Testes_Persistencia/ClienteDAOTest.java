/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes_Persistencia;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
    public void testeDeCriarELocalizarCliente(){
        ClienteDAO cdao = new ClienteDAO();
        HashMap<Long, ClienteEmpresa> clientes = cdao.voltaCashCliente();
        int numeroClienteAntes = clientes.size();
        Empresa e3 = new Empresa(3214124, "Empresa do cliente");
        ClienteEmpresa ce = new ClienteEmpresa(123, e3, 123456789, "ClienteTeste", 12345678);
        cdao.put(ce);
        clientes = cdao.voltaCashCliente();
        int numeroClienteDepois = clientes.size();
        Assert.assertEquals(numeroClienteAntes+1, numeroClienteDepois);
    }
}
