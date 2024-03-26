package testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programa.Funcionario;
import programa.Gerente;
import programa.Vendedor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTestes{
    private Funcionario gerente;
    private Funcionario vendedor;

    @BeforeEach
    void setUp(){
        this.gerente = new Gerente();
        this.vendedor = new Vendedor();
    }

    @Test
    public void incrementaVendasVendedor(){
        assertEquals(vendedor.getVendas(),0);
        vendedor.incrementaVendas();
        assertEquals(vendedor.getVendas(),1);
    }

    @Test
    public void cargoGerente(){
        assertEquals(gerente.getCargo().toLowerCase(), "gerente");
    }

    @Test
    public void cargoVendedor(){
        assertEquals(vendedor.getCargo().toLowerCase(), "vendedor");
    }

}