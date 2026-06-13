public class Doador extends MembroONG {
    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Resumo do doador:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Dias de atuação: " + getDiasAtuacao());
        System.out.println("Status: Doador Ativo");
        System.out.println("Valor doado por mês: R$ " + valorDoadoMensal);
        System.out.println();
    }
}