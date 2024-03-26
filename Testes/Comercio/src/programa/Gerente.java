package programa;

import programa.Funcionario;

public class Gerente extends Funcionario {

    private static final int FATOR_PONTUACAO = 4;

    private String cargo;

    public Gerente(){
        super();
        this.cargo = "Gerente";
    }

    public int getPontuacao() {
        return super.vendas * FATOR_PONTUACAO;
    }

    public String getCargo(){
        return this.cargo;
    }
}
