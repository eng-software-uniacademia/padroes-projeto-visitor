
public class Engenheiro implements Pessoa {

    private String nome;

    public Engenheiro(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEngenheiro(this);
    }
}