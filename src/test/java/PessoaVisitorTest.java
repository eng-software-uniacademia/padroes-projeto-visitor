import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirPiloto() {
        Piloto piloto = new Piloto(1, "Ana");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Piloto{numero=1, nome='Ana'}", visitor.exibir(piloto));
    }

    @Test
    void deveExibirEngenheiro() {
        Engenheiro engenheiro = new Engenheiro("Maria");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Engenheiro{nome='Maria'}", visitor.exibir(engenheiro));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente("Pedro");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gerente{nome='Pedro'}", visitor.exibir(gerente));
    }

}