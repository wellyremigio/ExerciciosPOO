package programa;

public abstract class Funcionario {

    protected int vendas;

    public Funcionario() {
        this.vendas = 0;
    }

    public void incrementaVendas() {
        this.vendas++;
    }

    public int getVendas() {
        return this.vendas;
    }

    public abstract int getPontuacao();

    public abstract String getCargo();
}
