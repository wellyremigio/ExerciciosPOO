package programa;

import programa.Funcionario;

public class Vendedor extends Funcionario {

    private static final int FATOR_PONTUACAO = 3;
    public String cargo;

    public Vendedor(){
        super();
        this.cargo = "Vendedor";
    }

    public int getPontuacao() {
        return super.vendas * FATOR_PONTUACAO;
    }

    public String getCargo(){
        return this.cargo;
    }
}



/*
package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programa.Funcionario;
import programa.Gerente;
import programa.Vendedor;

public class LojaTestes {

    private Funcionario gerente;
    private Funcionario vendedor;

    @BeforeEach
    void setUp()  {
        this.gerente = new Gerente();
        this.vendedor = new Vendedor();
    }

    @Test
    public void incrementarVendaVendedorTest() {
        assertEquals(vendedor.getVendas(), 0);
        vendedor.incrementaVendas();
        assertEquals(vendedor.getVendas(), 1);
    }

    @Test
    public void calcularPontuacaoVendedorTest() {
        assertEquals(vendedor.getPontuacao(),0);
        vendedor.incrementaVendas();
        assertEquals(vendedor.getPontuacao(),3);
    }

    @Test
    public void incremetarVendasGerente() {
        assertEquals(gerente.getVendas(), 0);
        gerente.incrementaVendas();
        assertEquals(gerente.getVendas(),1);
    }

    @Test
    public void calcularPontuacaoGerente() {
        assertEquals(gerente.getPontuacao(),0);
        gerente.incrementaVendas();
        gerente.incrementaVendas();
        assertEquals(gerente.getPontuacao(), 8);
    }
}

 */