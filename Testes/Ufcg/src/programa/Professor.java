package programa;

public class Professor {

    private String nome;
    private String disciplina;
    private double nota;

    public Professor(String nome, String displina, double nota){
        this.nome = nome;
        this.disciplina = displina;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Professor: "+getNome();
    }
}
