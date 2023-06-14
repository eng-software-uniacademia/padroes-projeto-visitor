
public class Gerente implements Pessoa {

    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
}