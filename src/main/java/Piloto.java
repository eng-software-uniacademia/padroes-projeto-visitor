
public class Piloto implements Pessoa {

    private String nome;
    private int numero;

    public Piloto(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPiloto(this);
    }
}