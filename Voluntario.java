public class Voluntario extends MembroONG {
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Resumo do voluntário:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Dias de atuação: " + getDiasAtuacao());
        System.out.println("Setor: " + setor);
        System.out.println();
    }
}