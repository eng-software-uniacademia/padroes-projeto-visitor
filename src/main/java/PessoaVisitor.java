public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirPiloto(Piloto piloto) {
        return "Piloto{" +
                "numero=" + piloto.getNumero() +
                ", nome='" + piloto.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirEngenheiro(Engenheiro engenheiro) {
        return "Engenheiro{" +
                "nome='" + engenheiro.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "nome='" + gerente.getNome() + '\'' +
                '}';
    }
}