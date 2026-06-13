public class MembroONG {
    private String nome;
    private String cpf;
    private int diasAtuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    public void setDiasAtuacao(int diasAtuacao) {
        if (diasAtuacao < 0) {
            System.out.println("Os dias de atuação não podem ser negativos.");
        } else {
            this.diasAtuacao = diasAtuacao;
        }
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Dias de atuação: " + diasAtuacao);
    }
}