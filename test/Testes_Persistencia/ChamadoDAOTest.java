/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes_Persistencia;

import Persistencia.ChamadoDAO;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.SistemaOperacional;
import entidade.Tecnico;
import entidade.TipoConexao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vicmc12
 */
public class ChamadoDAOTest {
    
    public ChamadoDAOTest() {
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
    public void inserirChamadoTest() {
        Tecnico t1 = new Tecnico("TecnicoTeste", 12345);
        Empresa e3 = new Empresa(3214124, "Empresa do cliente");
        ClienteEmpresa ce = new ClienteEmpresa(123, e3, 123456789, "ClienteTeste", 12345678);
        ChamadoDAO cdao = new ChamadoDAO();
        Chamado chamado = new Chamado(2, "Problema Teste", "Descrição", 3, t1,ce , SistemaOperacional.WINDOWS + "", "8", TipoConexao.ADSL + "", "20");
        cdao.put(chamado);
        Chamado chamadoInserido = cdao.get(cdao.gerarCodigo() - 1);
        Assert.assertEquals(chamado, chamadoInserido);
    }
}
