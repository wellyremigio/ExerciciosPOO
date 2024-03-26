package testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programa.Professor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProfessorTest {
    private Professor professor1;
    private Professor professor2;

    @BeforeEach
    void setUp(){
        this.professor1 = new Professor("Fubica","SO", 10);
        this.professor2 = new Professor("Melina","Psoft", 8);
    }

    @Test
    public void nomeDoProfessorTest(){
        assertEquals(professor1.getNome().toUpperCase(), "FUBICA");
        assertEquals(professor2.getNome().toUpperCase(), "MELINA");
    }

   @Test
   public void disciplinaProfessorTest() {
       assertEquals(professor1.getDisciplina().toLowerCase(), "so");
       assertNotEquals(professor2.getDisciplina().toLowerCase(), "so");
   }

   @Test
   public void notasProfessores(){
        assertNotEquals(professor1.getNota(), 9.9);
        assertEquals(professor2.getNota(),8);
   }
}
